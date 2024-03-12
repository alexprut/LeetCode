/**
 Time Complexity: O(logn)
 Space Complexity: O(n)
 */
class Solution {
    public int findPeakElement(int[] nums) { // [2,1]
        int middle = 0;
        int start = 0;
        int end = nums.length - 1; // 1
        while (start < end) { // 0,1
            middle = start + (end - start) / 2; // (1+0)/2=0
            if (nums[middle] < nums[middle + 1]) {
                start = middle + 1;
            } else {
                end = middle;
            }
        }

        return start;
    }
}