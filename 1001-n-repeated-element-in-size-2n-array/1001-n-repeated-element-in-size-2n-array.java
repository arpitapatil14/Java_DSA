class Solution {
    public int repeatedNTimes(int[] nums) {
        int len = nums.length;
        int[] freq = new int[10000];
        int ans = 0;
        for (int num : nums) {
            freq[num]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] * 2 == len) {
                ans = i;
            }
        }
        return ans;
    }
}
