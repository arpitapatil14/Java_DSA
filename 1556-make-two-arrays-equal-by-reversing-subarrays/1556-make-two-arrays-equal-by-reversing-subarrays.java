class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] freq= new int[10000];
        for(int num:target){
            freq[num]++;
        }
        for(int num:arr){
            freq[num]--;
        }
        for(int num: freq){
            if(num!=0){
                return false;
            }
        }
        return true;
        
    }
}