class Solution {
    public void nextPermutation(int[] nums) {
        int n= nums.length;
        int idx1=-1;
        int idx2=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx1=i;
                break;
            }
        }
        if(idx1!=-1){
            for(int i=n-1;i>idx1;i--){
            if(nums[idx1]<nums[i]){
                idx2=i;
                break;
            }
        }
        swap(nums,idx1,idx2);
        }
        
        reverse(nums,idx1+1,n-1);
        
    }
    public static void swap(int[] nums, int idx1,int idx2){
        int temp=nums[idx1];
        nums[idx1]=nums[idx2];
        nums[idx2]=temp;
    }
    public static void reverse(int[] nums, int start, int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}