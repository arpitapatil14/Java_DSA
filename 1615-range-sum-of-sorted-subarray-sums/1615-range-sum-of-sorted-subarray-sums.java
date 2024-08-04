class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        long ans = 0; 
        int[] subarr = new int[n * (n + 1) / 2];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                subarr[index++] = sum;
            }
        }
        
        Arrays.sort(subarr);
        int mod = (int)1e9 + 7;
        
        for (int i = left - 1; i < right; i++) {
            ans = (ans + subarr[i]) % mod;
        }
        return (int) ans;
    }
}
