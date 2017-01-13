extern "C"
#define BLOCKSIZE 128
__global__ void maxmin3(int *rdd_array, int *result_array, int len){
	unsigned int id = (blockIdx.y * gridDim.x + blockIdx.x) * blockDim.x + threadIdx.x;
	if (id == 0){
		result_array[0] = rdd_array[0];
//		result_array[1] = rdd_array[len-1];
	}
	if (id == len-1){
		result_array[1] = rdd_array[len-1];
	}
}
