class Solution {
    public int[] sortedSquares(int[] nums) {
      
      for(int i=0;i<nums.length;i++){
        nums[i]=nums[i]*nums[i];
      }
      int head=0;
      int tail=nums.length-1;
      int[] result= new int[nums.length];
      for(int pos=nums.length-1;pos>=0;pos--){
        if(nums[head]>nums[tail]){
          result[pos] =nums[head];
          head++;
        }
        else{
          result[pos]=nums[tail];
          tail--;
        }
      }
          return result;

    }
}