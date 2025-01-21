class Solution {
    public int maximumDifference(int[] nums) {
       //int maxdiff= Integer.MIN_VALUE;
       int maxdiff=-1;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] > nums[i]){
                    maxdiff=Math.max(maxdiff,nums[j]-nums[i]);
                }
            }
        }
        return maxdiff;
        
    }
}