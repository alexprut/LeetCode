class Solution {
	public int[] smallerNumbersThanCurrent(int[] nums) {
		int[] res = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i != j && nums[i] > nums[j]) {
					res[i]++;
				}
			}
		}
		return res;
	}
}