/**
 Time complexity: O(n)
 Space complexity: O(1)
 */
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                counter += map.get(nums[i]);
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        return counter;
    }
}