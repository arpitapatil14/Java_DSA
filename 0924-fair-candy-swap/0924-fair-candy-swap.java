class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int alicetotal=0;
        int bobtotal=0;
        int[] ans= new int[2];
        for(int a: aliceSizes ){
            alicetotal+=a;
        }
        for(int b: bobSizes){
            bobtotal+=b;
        }
        int m= (bobtotal-alicetotal)/2;
        for (int a : aliceSizes) {
            for (int b : bobSizes) {
                if (b - a == m) {
                    ans[0] = a;
                    ans[1] = b;
                    return ans;
                }
            }
        }
        return ans;
        
    }
}