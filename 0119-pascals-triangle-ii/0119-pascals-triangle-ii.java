class Solution {
        public static List<Integer> ncr(int row) {
        List<Integer> finall = new ArrayList<Integer>();
        long ans = 1;
        finall.add((int) ans);  
        for (int i = 1; i <= row; i++) {
            ans *= (row - i + 1);
            ans /= i;
            finall.add((int) ans);  
        }
        return finall; 
    }
    public List<Integer> getRow(int rowIndex) {
        return ncr(rowIndex); 
    }
}
