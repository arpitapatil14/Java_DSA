class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        if (m * n < 9) {
            return ans;
        }
        int[][] mat1 = { { 4, 3, 8 }, { 9, 5, 1 }, { 2, 7, 6 } };
        int[][] mat2 = { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } };
        int[][] mat3 = { { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } };
        int[][] mat4 = { { 6, 7, 2 }, { 1, 5, 9 }, { 8, 3, 4 } };
        int[][] mat5 = { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } };
        int[][] mat6 = { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } };
        int[][] mat7 = { { 2, 9, 4 }, { 7, 5, 3 }, { 6, 1, 8 } };
        int[][] mat8 = { { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } };

        for (int i = 0; i <= m - 3; i++) {
            for (int j = 0; j <= n - 3; j++) {
                int[][] submatrix = new int[3][3];
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        submatrix[x][y] = grid[i + x][j + y];
                    }
                }
                if (Arrays.deepEquals(submatrix, mat1) || Arrays.deepEquals(submatrix, mat2) ||
                    Arrays.deepEquals(submatrix, mat3) || Arrays.deepEquals(submatrix, mat4) ||
                    Arrays.deepEquals(submatrix, mat5) || Arrays.deepEquals(submatrix, mat6) ||
                    Arrays.deepEquals(submatrix, mat7) || Arrays.deepEquals(submatrix, mat8)) {
                    ans++;
                }
            }
        }
        return ans;
    }
}