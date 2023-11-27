class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[Math.max(4, n + 1)];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        return dp[n];
    }
}