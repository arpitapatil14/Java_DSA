class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }
        for(int num : nums){
            if(num!=0){
                nums[j]=num;
                j++;
            }
        }
        while(j<n){
            nums[j]=0;
            j++;
        }
        return nums;
    }
}
