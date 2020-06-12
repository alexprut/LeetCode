class Solution {
	public int[] shuffle(int[] nums, int n) {
		int[] res = new int[2 * n];
		int c = 0;
		for (int i = 0; i < n; i++) {
			res[c] = nums[i]; c++;
			res[c] = nums[i + n]; c++;
		}
		return res;
	}
}