class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minSoFar = Integer.MAX_VALUE;
        int sumSoFar = 0;
        int startIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            sumSoFar += nums[i];
            while (sumSoFar >= target) {
                minSoFar = Math.min(i - startIndex + 1, minSoFar);
                sumSoFar -= nums[startIndex];
                startIndex++;
            }
        }

        return minSoFar != Integer.MAX_VALUE ? minSoFar : 0;
    }
}