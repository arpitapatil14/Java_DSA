class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
            int carry =a&b;
            int sum= a^b;
            //int actualsum= sum ^ ((a&b)<<1);
            a =sum;
            b=carry<<1;

        }
             return a;

        
    }
}