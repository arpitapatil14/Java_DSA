class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq=new int[10000];
        int ans=0;
        for(int num: nums){
            freq[num]++;
        }
        int max=0;
        int ans1=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>max){
                max=freq[i];
            }
        }
        for(int num1: freq){
            if(num1==max){
                ans1+=num1;
            }
        }
        return ans1;
                
    }
}