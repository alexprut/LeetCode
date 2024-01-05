class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int s = -1;
        while (start <= end) {
            int middle = (end + start) / 2;
            if (nums[middle] == target) { s = middle; }
            if (nums[middle] >= target) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }

        if (s == -1) {
            return new int[] {-1,-1};
        }

        int e = -1;
        start = s;
        end = nums.length - 1;
        while (start <= end) {
            int middle = (end + start) / 2;
            if (nums[middle] == target) {
                e = middle;
                start = middle + 1;
            } else if (nums[middle] < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }

        }

        return new int[]{s,e};
    }
}