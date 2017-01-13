extern "C"
#define BLOCKSIZE 128

__global__ void maxmin(int *rdd_array, int *max_array, int len)
{
	unsigned int id = (blockIdx.y * gridDim.x + blockIdx.x) * blockDim.x + threadIdx.x;
//	unsigned int tid = threadIdx.x;

	/*
	for (unsigned int s = 1; s <= rep; s++) {
		if (id % 2 == 0) {
			if(max_array[id]>max_array[id+1]) {
				max_array2[id/2] = max_array[id];
				max_array2[id/2+len/2] = max_array[id+1];
			} else {
				max_array2[id/2] = max_array[id+1];
				max_array2[id/2+len/2] = max_array[id];
			}
		}
		__syncthreads();
		max_array[id] = max_array2[id];
		__syncthreads();
	}
	*/


//	for (unsigned int s = 1; s <= rep; s++) {
		if (id < len/2) {
			int v1 = max_array[id*2];
			int v2 = max_array[id*2+1];
			if (v1 > v2) {
				rdd_array[id] = v1;
				rdd_array[id + len/2] = v2;
			} else {
				rdd_array[id] = v2;
				rdd_array[id + len/2] = v1;
			}
//			__syncthreads();
		}
//		max_array[id] = max_array2[id];
//		__syncthreads();
//	}
//	__syncthreads();

//	if (id == 0) {
//		result_array[0] = max_array[0];
//		result_array[1] = max_array[len-1];
//	}
}
