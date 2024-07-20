class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int[][] ans = new int[rowSum.length][colSum.length];
        for (int i = 0; i < rowSum.length; i++) {
            for (int j = 0; j < colSum.length; j++) {
                int val = Math.min(rowSum[i], colSum[j]);
                rowSum[i] -= val;
                colSum[j] -= val;
                ans[i][j] = val;
            }
        }
        return ans;
    }
}