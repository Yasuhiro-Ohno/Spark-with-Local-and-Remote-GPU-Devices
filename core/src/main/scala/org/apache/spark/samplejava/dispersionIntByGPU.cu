extern "C"
#define BLOCKSIZE 128

__global__ void dispersion(int *rdd_array, double *result_array2, double avg)
{
	__shared__ double sdata[BLOCKSIZE];

	unsigned int id = (blockIdx.y * gridDim.x + blockIdx.x) * blockDim.x + threadIdx.x;
	unsigned int tid = threadIdx.x;
	sdata[tid] = (rdd_array[id] - avg) * (rdd_array[id] - avg);
	__syncthreads();

	for (unsigned int s = 1; s < blockDim.x; s *= 2) {
		if (tid % (2*s) == 0) {
			sdata[tid] += sdata[tid + s];
		}
		__syncthreads();
	}

	if (tid == 0) {
		result_array2[blockIdx.y * gridDim.x + blockIdx.x] = sdata[0];
	}
}
