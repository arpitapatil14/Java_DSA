class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int lowerLast = -1;
            int upperFirst = -1;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (c == ch) {
                    lowerLast = i;
                }
                if (c == Character.toUpperCase(ch)) {
                    if (upperFirst == -1) {
                        upperFirst = i;
                    }
                }
            }
            if (lowerLast != -1 &&
                upperFirst != -1 &&
                lowerLast < upperFirst) {

                count++;
            }
        }

        return count;
    }
}