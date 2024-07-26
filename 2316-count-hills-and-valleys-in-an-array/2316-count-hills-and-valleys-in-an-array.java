class Solution {
    public int countHillValley(int[] nums) {
        int hills = 0;
        int valleys = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue; 
            }
            int j = i - 1;
            while (j >= 0 && nums[j] == nums[i]) {
                j--;
            }
            if (j >= 0) {
                if (nums[i] > nums[j] && nums[i] > nums[i + 1]) {
                    hills++;
                } else if (nums[i] < nums[j] && nums[i] < nums[i + 1]) {
                    valleys++;
                }
            }
        }
        return hills + valleys;
    }
}
