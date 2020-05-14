/**
 [[1,2],[3,4]] to [1,2,3,4]
 t = i * nums[0].length + j + 1 = 0*2+0+1=1
 0*2+0+1=1
 0*2+1+1=2
 1*2+0+1=3
 1*2+1+1=4
 t / r = 1 / 4 = 0
 2/4 = 0
 3/4 = 0
 4/4 = 1
 t % c = 1 - 1 % 4 = 0
 2 - 1 % 4 = 1
 3 - 1 % 4 = 2
 4 - 1 % 4 = 3
 **/
class Solution {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		if (r * c != nums.length * nums[0].length) { return nums; }
		int[][] res = new int[r][c];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				int t = i * nums[0].length + j + 1;
				res[(t - 1) / c][(t - 1) % c] = nums[i][j];
			}
		}
		return res;
	}
}