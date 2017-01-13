extern "C"
#define BLOCKSIZE 128

__global__ void sum(double *d_A, double *d_B)
{
	__shared__ double sdata[BLOCKSIZE];

	unsigned int id = (blockIdx.y * gridDim.x + blockIdx.x) * blockDim.x + threadIdx.x;
	unsigned int tid = threadIdx.x;
	sdata[tid] = d_A[id];
	__syncthreads();

	for (unsigned int s = 1; s < blockDim.x; s *= 2) {
		if (tid % (2*s) == 0) {
			sdata[tid] += sdata[tid + s];
		}
		__syncthreads();
	}

	if (tid == 0) {
		d_B[blockIdx.y * gridDim.x + blockIdx.x] = sdata[0];
	}
}
