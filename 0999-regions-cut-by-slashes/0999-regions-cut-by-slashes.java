class Solution {
    boolean[][] visited;

    public void buildGraph(int rows, int cols, String[] grid, int[][] graph) {
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                char ch = grid[i].charAt(j);
                int gridRow = i*3, gridCol = j*3;
                switch(ch) {
                    case '/': {
                        graph[gridRow][gridCol+2] = 1;
                        graph[gridRow+1][gridCol+1] = 1;
                        graph[gridRow+2][gridCol] = 1;
                        break;
                    }
                    case '\\': {
                        graph[gridRow][gridCol] = 1;
                        graph[gridRow+1][gridCol+1] = 1;
                        graph[gridRow+2][gridCol+2] = 1;
                        break;
                    }
                    default: {
                        break;
                    }
                }
            }
        }
    }

    public int regionsBySlashes(String[] grid) {
        int rows = grid.length, cols = grid[0].length();
        int[][] graph = new int[rows*3][cols*3];

        buildGraph(rows, cols, grid, graph);

        visited = new boolean[rows*3][cols*3];
        int res = 0;

        for(int i=0; i<rows*3; i++) {
            for(int j=0; j<cols*3; j++) {
                if(!visited[i][j] && graph[i][j] == 0) {
                    res++;
                    dfs(i, j, graph);
                }
            }
        }

        return res;
    }

    int[][] dir = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};

    public void dfs(int row, int col, int[][] graph) {
        if(row < 0 || col < 0 || row == graph.length || col == graph[0].length || graph[row][col] == 1 || visited[row][col]) return;

        visited[row][col] = true;

        for(int i=0; i<4; i++) {
            int newRow = row+dir[i][0], newCol = col+dir[i][1];
            dfs(newRow, newCol, graph);
        }
    }
}