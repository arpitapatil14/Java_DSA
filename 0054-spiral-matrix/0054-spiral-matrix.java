public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return ans;
        }
        int sr = 0;
        int er = matrix.length - 1;
        int sc = 0;
        int ec = matrix[0].length - 1;
        while (sr <= er && sc <= ec) {
            for (int i = sc; i <= ec; i++) {
                ans.add(matrix[sr][i]);
            }
            sr++;
            for (int i = sr; i <= er; i++) {
                ans.add(matrix[i][ec]);
            }
            ec--;
            if (sr <= er) {
                for (int i = ec; i >= sc; i--) {
                    ans.add(matrix[er][i]);
                }
                er--;
            }
            if (sc <= ec) {
                for (int i = er; i >= sr; i--) {
                    ans.add(matrix[i][sc]);
                }
                sc++;
            }
        }
        return ans;
    }
}
