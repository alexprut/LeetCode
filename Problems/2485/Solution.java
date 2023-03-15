/**
 Space complexity: O(n)
 Time complexity: O(n)
 */
class Solution {
    public int pivotInteger(int n) {
        int[] s = new int[n + 1];
        // build sum array
        for (int i = 0; i <= n; i++) {
            if (i == 0) { s[i] = i; } else {
                s[i] = s[i - 1] + i;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (s[i] == s[n] - s[i - 1]) {
                return i;
            }
        }

        return -1;
    }
}