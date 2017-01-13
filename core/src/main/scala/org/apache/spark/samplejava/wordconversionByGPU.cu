extern "C"
#define BLOCKSIZE 128

__global__ void wordconversion(char *rdd_array, char *result_array, int f)
{
	unsigned int id = (blockIdx.y * gridDim.x + blockIdx.x) * blockDim.x + threadIdx.x;
	//unsigned int tid = threadIdx.x;
	if (f == 0) {
		if (rdd_array[id]>='a' && rdd_array[id]<='z'){
			result_array[id] = rdd_array[id]-32;
		} else {
			result_array[id] = rdd_array[id];
		}
	} else {
		if (rdd_array[id]>='A' && rdd_array[id]<='Z'){
			result_array[id] = rdd_array[id]+32;
		} else {
			result_array[id] = rdd_array[id];
		}
	}
}
