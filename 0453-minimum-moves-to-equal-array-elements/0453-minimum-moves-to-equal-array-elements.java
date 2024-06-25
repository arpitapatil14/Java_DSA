class Solution {
    public int minMoves(int[] nums) {
        int count=0;
        int diff=0;
        Arrays.sort(nums);
        int min= nums[0];
        for(int num:nums){
            diff=num-min;
            count+=diff;
        }
        return count;
        
    }
}