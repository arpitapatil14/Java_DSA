class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < word.length()) {
            char currentChar = word.charAt(i);
            int count = 0;
            while (i < word.length() && word.charAt(i) == currentChar && count < 9) {
                count++;
                i++;
            }
            sb.append(count).append(currentChar);
        }
        
        return sb.toString();
    }
}
