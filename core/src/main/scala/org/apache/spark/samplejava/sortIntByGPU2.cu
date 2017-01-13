extern "C"

//#include <stdio.h>
//#include <stdlib.h>

__global__ void sort(int *rdd_array, int j, int k, int f)
{
	unsigned int i = (blockIdx.y * gridDim.x + blockIdx.x) * blockDim.x + threadIdx.x;
	unsigned int ixj = i^j;

	if (f == 0) {//ascending order
		if ((ixj)>i) {
			if ((i&k)==0) {
				if (rdd_array[i] > rdd_array[ixj]) {
					int tmp = rdd_array[i];
					rdd_array[i] = rdd_array[ixj];
					rdd_array[ixj] = tmp;
				}
			} else {
//			if ((i&k)!=0) {
				if (rdd_array[i] < rdd_array[ixj]) {
					int tmp = rdd_array[i];
					rdd_array[i] = rdd_array[ixj];
					rdd_array[ixj] = tmp;
				}
			}
		}
	} else {//descending order
		if ((ixj)>i) {
			if ((i&k)==0) {
				if (rdd_array[i] < rdd_array[ixj]) {
					int tmp = rdd_array[i];
					rdd_array[i] = rdd_array[ixj];
					rdd_array[ixj] = tmp;
				}
			} else {
//			if ((i&k)!=0) {
				if (rdd_array[i] > rdd_array[ixj]) {
					int tmp = rdd_array[i];
					rdd_array[i] = rdd_array[ixj];
					rdd_array[ixj] = tmp;
				}
			}
		}
	}
}
