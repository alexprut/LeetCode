class Solution {
	public int[] createTargetArray(int[] nums, int[] index) {
		int[] res = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (i == index[i]) {
				res[i] = nums[i];
			} else {
				// shift to right
				for (int k = i; k > index[i]; k--) {
					res[k] = res[k - 1];
				}
				res[index[i]] = nums[i];
			}
		}
		return res;
	}
}