class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        int diff=0;
        for(int i=0;i<s.length()-1;i++){
            diff=(int)(s.charAt(i)-s.charAt(i+1));
            diff= Math.abs(diff);
            sum+=diff;
        }
        return sum;
        
    }
}