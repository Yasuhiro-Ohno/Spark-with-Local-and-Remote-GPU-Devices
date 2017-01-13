extern "C"

//#include <stdio.h>
//#include <stdlib.h>

__global__ void sort(int *rdd_array, int DataSize)
{
	unsigned int id = (blockIdx.y * gridDim.x + blockIdx.x) * blockDim.x + threadIdx.x;

	for (unsigned int length = 2; length <= DataSize; length = length * 2) {

		for (unsigned int mlength = length/2; mlength > 0; mlength = mlength/2) {
			unsigned int ixj = id ^ mlength;

			if (ixj > id) {
				if ((id & length) == 0) {
					if (rdd_array[id] > rdd_array[ixj]) {
						int tmp = rdd_array[ixj];
						rdd_array[ixj] = rdd_array[id];
						rdd_array[id] = tmp;
					}
				} else {
					if (rdd_array[id] < rdd_array[ixj]) {
						int tmp = rdd_array[ixj];
						rdd_array[ixj] = rdd_array[id];
						rdd_array[id] = tmp;
					}
				}
			}
			__threadfence();
			__syncthreads();
		}
	}
}
