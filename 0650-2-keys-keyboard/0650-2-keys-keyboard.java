class Solution {
    public int minSteps(int n) {
        int clipBoard = 0;
        int res = 1, i = 0;
        while(res<n){
            if(n%res == 0){
                clipBoard = res;
                res += clipBoard;
                i += 2;
            }
            else{
                res += clipBoard;
                i++;
            }
        }
        return i;
    }
}