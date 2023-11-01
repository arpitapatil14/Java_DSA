class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
        if(n==1 || n>1 && (n & (n - 1)) == 0){
            return true;
        }

        return false;
        
    }
}