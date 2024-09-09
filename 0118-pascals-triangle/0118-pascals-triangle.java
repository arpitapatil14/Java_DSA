public class Solution {
    public static int ncr(int n, int r) {
        long ans = 1;
        for (int i = 0; i < r; i++) {
            ans *= (n - i);
            ans /= (i + 1);
        }
        return (int) ans;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        
        for (int row = 0; row < numRows; row++) {
            List<Integer> temp = new ArrayList<Integer>();
            for (int col = 0; col <= row; col++) {
                temp.add(ncr(row, col)); 
            }
            triangle.add(temp);
        }
        return triangle;
    }

}
