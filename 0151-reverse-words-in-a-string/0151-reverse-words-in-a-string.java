class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+"); // Split the input string into words
        String reversed = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i];
            if (i > 0) {
                reversed += " "; 
            }
        }

        return reversed;
    }
}
