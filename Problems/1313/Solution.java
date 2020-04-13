class Solution {
	public int[] decompressRLElist(int[] nums) { // [1,2,3,4]
		int counter = 0;
		for (int i = 0; i < nums.length; i = i + 2) { // i = 0, 2
			counter += nums[i]; // counter = 1, 4
		}
		int[] res = new int[counter]; // [0,0,0,0]
		int c = 0;
		for (int i = 0; i < nums.length; i = i + 2) { // i = 0, 2
			for (int j = 0; j < nums[i]; j++) { // j = 0,1 < 3
				res[c] = nums[i + 1]; // res[0, 1, 2] = 4
				c++; // c = 1, 2
			}
		}
		return res;
	}
}