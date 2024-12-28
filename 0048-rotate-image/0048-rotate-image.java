class Solution {
    public void rotate(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<m;i++){
            reverse(matrix[i]);
        }
        
    }
    public static void reverse(int[] matrix){
        int l=0;
        int r=matrix.length-1;
        while(l<r){
            int temp=matrix[l];
            matrix[l]=matrix[r];
            matrix[r]=temp;
            r--;
            l++;
        }
    }
}