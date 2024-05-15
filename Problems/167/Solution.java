class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[] = new int[2];
        for (int i = 0; i < numbers.length - 1; i++) {
            int res = search(numbers, target - numbers[i], i);
            if (res != -1) {
                ans[0] = i + 1;
                ans[1] = res + 1;
                return ans;
            }
        }
        return ans;
    }

    public int search(int[] numbers, int target, int exclude) {
        int start = 0;
        int end = numbers.length - 1;
        while (end >= start) {
            int middle = start + (end - start) / 2;
            if (numbers[middle] == target && middle != exclude) {
                return middle;
            }
            if (numbers[middle] <= target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }
}