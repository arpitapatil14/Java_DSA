class Solution {
    public List<String> commonChars(String[] words) {
        List<String> answer = new ArrayList<>();
        int n = words.length;
        int[] freqq = new int[26];
        for (char c : words[0].toCharArray()) {
            freqq[c - 'a']++;
        }
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            for (char c : words[i].toCharArray()) {
                freq[c - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                freqq[j] = Math.min(freqq[j], freq[j]);
            }
        }
        for (int i = 0; i < 26; i++) {
            while(freqq[i]-- > 0) {
                answer.add(String.valueOf((char) (i + 'a')));
            }
        }
        return answer;
    }
}