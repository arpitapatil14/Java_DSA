class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] directions = {
            {0, 1},  // EAST
            {1, 0},  // SOUTH
            {0, -1}, // WEST
            {-1, 0}  // NORTH
        };
        int[][] result = new int[rows * cols][2];  
        int step = 0; 
        int dir  = 0; 
        result[0] = new int[]{rStart, cStart};
        int count = 1;
        while (count < rows * cols) {
            if (dir == 0 || dir == 2) step++;
            for (int i = 0; i < step; i++) {
                rStart += directions[dir][0];
                cStart += directions[dir][1];

                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) { 
                    result[count++] = new int[]{rStart, cStart};
                }
            }
            dir = (dir + 1) % 4; 
        }
        return result;
    }
}