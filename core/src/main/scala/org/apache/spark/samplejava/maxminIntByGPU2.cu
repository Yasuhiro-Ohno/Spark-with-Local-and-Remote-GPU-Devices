extern "C"
#define BLOCKSIZE 128
__global__ void maxmin2(int *rdd_array, int *max_array){
	unsigned int id = (blockIdx.y * gridDim.x + blockIdx.x) * blockDim.x + threadIdx.x;
	max_array[id] = rdd_array[id];
}
