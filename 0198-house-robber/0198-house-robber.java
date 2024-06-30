class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }            
        int[] profit = new int[n + 1]; // profit[i] : profit stolen till i-th house

        profit[0] = 0;
        profit[1] = nums[0];
        
        for (int i = 2; i <= n; i++) {
            int steal = nums[i - 1] + profit[i - 2];
            int skip = profit[i - 1];

            profit[i] = Math.max(steal, skip);
        }
        
        return profit[n];
    }
}
