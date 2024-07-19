class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> luckyNumbers = new ArrayList<>();
        Set<Integer> minRowValues = new HashSet<>();
        for (int[] row : matrix) { //row
            minRowValues.add(Arrays.stream(row).min().getAsInt());
        }
        for (int i= 0; i< matrix[0].length; i++) {//col
            int max = Integer.MIN_VALUE;
            for (int[] row : matrix) {
                max = Math.max(max, row[i]);
            }
            if (minRowValues.contains(max)) {
                luckyNumbers.add(max);
            }
        }
        
        return luckyNumbers;
    }
}
