class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n][n];
        int[] suffixSum = new int[n];
        
        suffixSum[n - 1] = piles[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = piles[i] + suffixSum[i + 1];
        }
        return helper(piles, 0, 1, dp, suffixSum);
    }
    private int helper(int[] piles, int i, int M, int[][] dp, int[] suffixSum) {
        int n = piles.length;
        if (i == n) {
            return 0;
        }
        if (2 * M >= n - i) {
            return suffixSum[i];
        }
        if (dp[i][M] != 0) {
            return dp[i][M];
        }
        int min = Integer.MAX_VALUE;
        for (int X = 1; X <= 2 * M; X++) {
            min = Math.min(min, helper(piles, i + X, Math.max(M, X), dp, suffixSum));
        }
        dp[i][M] = suffixSum[i] - min;
        return dp[i][M];
    }
}
