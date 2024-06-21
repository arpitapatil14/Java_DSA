class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int happy=0;
        for(int i=0;i<=grumpy.length-1;i++){
            if(grumpy[i]==0){
                 happy+=customers[i];//happy customer
            }
        }
        for(int i=0;i<minutes;i++){//first w
            if(grumpy[i]==1){
                 happy+=customers[i];
            }
        }
        int left=0;
        int right=minutes;
        int temp=happy;
        while(right<customers.length){
            if(grumpy[left]==1){
                temp-=customers[left];
            }
            if (grumpy[right]==1){
                temp+=customers[right];
            }
            right++;
            left++;
            happy= Math.max(happy,temp);
        }
        return happy;
    }
}