class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] words = sentence.split(" ");

        for (int j = 0; j < words.length; j++) {
            String replacement = null;
            for (String root : dictionary) {
                if (words[j].startsWith(root)) {
                    if (replacement == null || root.length() < replacement.length()) {
                        replacement = root;
                    }
                }
            }
            if (replacement != null) {
                words[j] = replacement;
            }
        }

        String result = String.join(" ", words);
        return result;
    }
}