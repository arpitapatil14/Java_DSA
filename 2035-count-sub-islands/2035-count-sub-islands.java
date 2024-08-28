class Solution {
    public boolean helper(int[][] g1, int[][] g2, int i, int j) {
        if(i < 0 || i >= g2.length || j < 0 || j >= g2[0].length) {
            return true;
        }
        if(g2[i][j] == 0) {
            return true;
        }
        if(g2[i][j] != g1[i][j]) {
            return false;
        }
        g2[i][j] = 0;
        boolean d = helper(g1, g2, i+1, j);
        boolean u = helper(g1, g2, i-1, j);
        boolean r = helper(g1, g2, i, j+1);
        boolean l = helper(g1, g2, i, j-1);
        return u && d && l && r;
    }
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int ans = 0;
        for(int i = 0;i < grid1.length;i++) {
            for(int j = 0;j < grid1[0].length;j++) {
                if(grid2[i][j] == 1 && helper(grid1, grid2, i, j)) {
                    ans++;
                }
            }
        }
        return ans;
    }
}