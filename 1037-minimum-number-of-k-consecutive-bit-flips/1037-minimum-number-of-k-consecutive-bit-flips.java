class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length ;
        int flip = 0;
        int a = 0;
        int[] arr = new int[n];
        for(int i= 0 ; i < nums.length;++i){
            if(i>=k)
                flip ^=arr[i-k];
                if(flip == nums[i]){
                    if(i+ k > nums.length)
                        return -1;
                
                arr[i]= 1;
                flip ^= 1;
                a++;
                }    
        }
        return a;
    }
}