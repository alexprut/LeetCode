class Solution {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		int[] res = new int[2];
		for (int i = 0; i < nums.length; i++) {
			int d = target - nums[i];
			if (map.containsKey(d) && i != map.get(d)) {
				res[0] = i;
				res[1] = map.get(d);
				return res;
			}
		}
		return res;
	}
}