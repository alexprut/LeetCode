/**
 Time complexity: O(n^2)
 Sliding window
 */
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int c = 0;
        // Window size
        for (int w = 1; w <= arr.length; w = w + 2) {
            // Create first window
            int acc = 0;
            int i = 0;
            while (i < w) {
                acc += arr[i];
                i++;
            }
            c += acc;
            while (i < arr.length) {
                acc -= arr[i - w];
                acc += arr[i];
                i++;
                c += acc;
            }
        }
        return c;
    }
}