class Solution {
    public int[] sortArray(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        
        int n = max - min;
        int[] count = new int[n + 1];
        
        for (int num : nums) {
            count[num - min]++;
        }
        
        int idx = 0;
        for (int i = 0; i <= n; i++) {
            while (count[i] > 0) {
                nums[idx] = i + min;
                idx++;
                count[i]--;
            }
        }
        
        return nums;
    }
}
