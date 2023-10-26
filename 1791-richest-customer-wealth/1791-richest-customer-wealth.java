class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = Integer.MIN_VALUE; //0

        for (int person = 0; person < accounts.length; person++) {
            int rowsum = 0;

            for (int account = 0; account < accounts[person].length; account++) {
                rowsum += accounts[person][account];
            }

            if (rowsum > sum) {
                sum = rowsum;
            }
        }

        return sum; 
    }
}
