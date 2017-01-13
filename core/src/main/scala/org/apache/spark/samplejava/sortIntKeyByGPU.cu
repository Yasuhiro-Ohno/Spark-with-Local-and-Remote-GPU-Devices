extern "C"
#define BLOCKSIZE 128

__global__ void sortkey(int *ks_rdd_array, int *cp_rdd_array, int *num_array, int j, int k, int count, int loop)
{
	const unsigned int i = (blockIdx.y * gridDim.x + blockIdx.x) * blockDim.x + threadIdx.x;
	int s = loop*32768*BLOCKSIZE;
//	const unsigned int i = blockIdx.x * blockDim.x + threadIdx.x;
	if (count == 0) {
		num_array[i + s] = i;
		cp_rdd_array[i + s] = ks_rdd_array[i + s];
		__syncthreads();
	}
	unsigned int ixj = i^j;

	if ((ixj)>i) {
		if ((i&k)==0) {
			if (cp_rdd_array[i + s] > cp_rdd_array[ixj + s]) {
				int tmp = cp_rdd_array[i + s];
				cp_rdd_array[i + s] = cp_rdd_array[ixj + s];
				cp_rdd_array[ixj + s] = tmp;

				int tmp2 = num_array[i + s];
				num_array[i + s] = num_array[ixj + s];
				num_array[ixj + s] = tmp2;
				__syncthreads();
			}
		} else {
			if (cp_rdd_array[i + s] < cp_rdd_array[ixj + s]) {
				int tmp = cp_rdd_array[i + s];
				cp_rdd_array[i + s] = cp_rdd_array[ixj + s];
				cp_rdd_array[ixj + s] = tmp;

				int tmp2 = num_array[i + s];
				num_array[i + s] = num_array[ixj + s];
				num_array[ixj + s] = tmp2;
				__syncthreads();
			}
		}
	}
}
