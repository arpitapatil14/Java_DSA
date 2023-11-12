class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] n1 = word1.toCharArray();
        char[] n2 = word2.toCharArray();
        int l1 = n1.length;
        int l2 = n2.length;
        char[] merged = new char[l1 + l2];
        int k = 0;
        int i = 0;

        while (i < l1 && i < l2) {
            merged[k++] = n1[i];
            merged[k++] = n2[i];
            i++;
        }

        while (i < l1) {
            merged[k++] = n1[i++];
        }

        while (i < l2) {
            merged[k++] = n2[i++];
        }

        return new String(merged);
    }
}
