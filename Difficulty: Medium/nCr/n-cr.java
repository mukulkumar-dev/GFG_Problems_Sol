class Solution {
    public int nCr(int n, int r) {
        // code here
        if (r > n) return 0;
        if (r == 0 || r == n) return 1;
        int[] dp = new int[r + 1];
        dp[0] = 1; 

        for (int i = 1; i <= n; i++) {
            for (int j = Math.min(i, r); j > 0; j--) {
                dp[j] = dp[j] + dp[j - 1];
            }
        }

        return dp[r];
    }
}