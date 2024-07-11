class Solution {
    public int minOperations(String[] logs) {
        int ans=0;
        for(String s:logs){
            ans+=sol(s);
            if(ans<0) ans=0;
        }
        return ans;
    }
    public int sol(String s){
        if(s.charAt(1)=='.') return -1;
        if(s.charAt(0)=='.') return 0;
        return 1;
    }
}