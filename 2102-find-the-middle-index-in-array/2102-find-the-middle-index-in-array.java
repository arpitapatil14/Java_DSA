class Solution {
    public int findMiddleIndex(int[] nums) {
        // int sum1=0;
        // int sum2=0;
        // int start=0;
        // int end=nums.length-1;
        // int mid= start + (end-start)/2;
        // if(nums.length<=1){
        //     return 0;
        // }
        // if(mid<1){
        //     return -1;
        // }
        // for(int i=0;i<mid;i++){
        //     sum1+=nums[i];
        // }
        // for(int i=mid;i<=end;i++){
        //     sum2+=nums[i];
        // }
        // if(sum1>sum2){
        //     mid-=1;
        // }else{
        //     mid+=1;
        // }
        // return mid;
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}