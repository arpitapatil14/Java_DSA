class Solution {
    public boolean canJump(int[] nums) {
        int maxIndex=0;
        int n= nums.length;
        if(n==1){
            return true;
        }
        for(int i=0;i<n-1;i++){
            if(i>maxIndex){
                return false;
            }
            maxIndex=Math.max(maxIndex,i+nums[i]);
            if(maxIndex>=n-1){
                return true;
            }
        }
        return false;
        
    }
}