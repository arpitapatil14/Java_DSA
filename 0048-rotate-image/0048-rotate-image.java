class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        // Transpose 
        for (int i = 0; i < m; i++) {
            for (int j = i; j < n; j++) { 
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < m; i++) {
            reverse(matrix[i]);
        }
    }
    private void reverse(int[] mat) { //rev array(row)
        int left = 0;
        int right = mat.length - 1;
        while (left < right) {
            int temp = mat[left]; 
            mat[left] = mat[right]; 
            mat[right] = temp; 
            left++;
            right--;
        }
    }
}
