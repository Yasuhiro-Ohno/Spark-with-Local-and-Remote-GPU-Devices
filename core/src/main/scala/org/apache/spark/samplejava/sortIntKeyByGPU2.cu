extern "C"

__global__ void sortkey(int *ks_rdd_array, int *cp_rdd_array, int *num_array, int j, int k, int count)
{
	const unsigned int i = (blockIdx.y * gridDim.x + blockIdx.x) * blockDim.x + threadIdx.x;
	if (count == 0) {
		num_array[i] = i;
		cp_rdd_array[i] = ks_rdd_array[i];
		__syncthreads();
	}
	unsigned int ixj = i^j;

	if ((ixj)>i) {
		if ((i&k)==0) {
			if (cp_rdd_array[i] < cp_rdd_array[ixj]) {
				int tmp = cp_rdd_array[i];
				cp_rdd_array[i] = cp_rdd_array[ixj];
				cp_rdd_array[ixj] = tmp;

				int tmp2 = num_array[i];
				num_array[i] = num_array[ixj];
				num_array[ixj] = tmp2;
				__syncthreads();
			}
		} else {
			if (cp_rdd_array[i] > cp_rdd_array[ixj]) {
				int tmp = cp_rdd_array[i];
				cp_rdd_array[i] = cp_rdd_array[ixj];
				cp_rdd_array[ixj] = tmp;

				int tmp2 = num_array[i];
				num_array[i] = num_array[ixj];
				num_array[ixj] = tmp2;
				__syncthreads();
			}
		}
	}
}
