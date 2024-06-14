class Solution {
    public int numberOfChild(int n, int k) {
        if(k<n){
            return k;
        }else{
            int round = k / (n - 1);
            int rem = k % (n - 1);
            if(round%2==1){
                return (n - 1) - rem;
            }else{
                return rem;
            }
        }
    }
}