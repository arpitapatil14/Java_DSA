import java.util.Arrays;

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String new1="";
        String new2="";
        
        
        for(int i=0;i<word1.length;i++){
            new1 = new1+word1[i];
        }
        for(int i=0;i<word2.length;i++){
            new2 = new2+word2[i];
        }
        return(new1.equals(new2));
       
       
    }
   
   
}