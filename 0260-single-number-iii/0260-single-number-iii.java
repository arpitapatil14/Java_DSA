class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int num:nums){
            xor=xor^num;
        }
        int mask= xor & (-xor);
        int xorA=0;
        int xorB=0;
        for(int num:nums){
            if((mask & num) ==0){
                xorA=xorA^num;
            }else{
                xorB=xorB^num;
            }
        }
        return new int[]{xorA,xorB};
    }
}