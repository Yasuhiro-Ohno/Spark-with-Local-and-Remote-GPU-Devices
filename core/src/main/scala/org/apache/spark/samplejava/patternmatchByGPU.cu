extern "C"
#define BLOCKSIZE 128

//__global__ void patternmatch(char *rdd_array, char *pattern_array, char *flag_array, char *result_array, int *count_array, int length, int p_length)
__global__ void patternmatch(char *rdd_array, char *pattern_array, char *flag_array, int length, int p_length)
{
	unsigned int id = (blockIdx.y * gridDim.x + blockIdx.x) * blockDim.x + threadIdx.x;
	//unsigned int tid = threadIdx.x;

	flag_array[id] = '0';
	//result_array[id] = '0';
	__syncthreads();

	int i = 0;
	
	if (p_length == 1) {//p_length == 1
		if (rdd_array[id] == pattern_array[0]) {
			flag_array[id] = rdd_array[id];
		}
	} else if (p_length == 2) {//p_length == 2
		if (rdd_array[id] == pattern_array[0] && 
					rdd_array[id+1] == pattern_array[1]) {
			flag_array[id] = rdd_array[id];
			flag_array[id+1] = rdd_array[id+1];
		}
	} else if (p_length == 3) {//p_length == 3
		if (rdd_array[id] == pattern_array[0] &&
					rdd_array[id+1] == pattern_array[1] &&
						rdd_array[id+2] == pattern_array[2]) {
			flag_array[id] = rdd_array[id];
			flag_array[id+1] = rdd_array[id+1];
			flag_array[id+2] = rdd_array[id+2];
		}
	} else if (p_length == 4) {//p_length == 4
		if (rdd_array[id] == pattern_array[0] &&
					rdd_array[id+1] == pattern_array[1] &&
						rdd_array[id+2] == pattern_array[2] &&
							rdd_array[id+3] == pattern_array[3]) {
			flag_array[id] = rdd_array[id];
			flag_array[id+1] = rdd_array[id+1];
			flag_array[id+2] = rdd_array[id+2];
			flag_array[id+3] = rdd_array[id+3];
		}
	} else if (p_length == 5) {//p_length == 5
		if (rdd_array[id] == pattern_array[0] &&
					rdd_array[id+1] == pattern_array[1] &&
						rdd_array[id+2] == pattern_array[2] &&
							rdd_array[id+3] == pattern_array[3] &&
								rdd_array[id+4] == pattern_array[4]) {
			flag_array[id] = rdd_array[id];
			flag_array[id+1] = rdd_array[id+1];
			flag_array[id+2] = rdd_array[id+2];
			flag_array[id+3] = rdd_array[id+3];
			flag_array[id+4] = rdd_array[id+4];
	//	}
	//}
	//__syncthreads();

			
			i = 0;
			while ((rdd_array[id-i] != '\\')) {
				if (id-i == 0) {
					break;
				}
				flag_array[id-i] = rdd_array[id-i];
				i++;
			}

			i = 4;
			do {
				i++;
				if (id+i >= length-1) {
					break;
				}
				flag_array[id+i] = rdd_array[id+i];
			} while (rdd_array[id+i] != '\\');
			

		}
	}
	__syncthreads();

	/*
  if (id == 0) {
		int count = 0;
		for (int j = 0; j < length; j++) {
			if (flag_array[j] != '0') {
				result_array[count] = flag_array[j];
				count++;
			}
			//__syncthreads();
		}
		//__syncthreads();
		count_array[0] = count;
  }
	//__syncthreads();
	*/
}
