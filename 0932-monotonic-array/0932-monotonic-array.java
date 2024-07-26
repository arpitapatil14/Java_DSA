class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length==1){
            return true;    
        }
        Boolean inc=true;
        Boolean dec=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                dec=false;
            }else if (nums[i] > nums[i + 1]){
                inc=false;
            }
        }
        return inc || dec;
        
    }
}