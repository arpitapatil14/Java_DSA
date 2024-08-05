class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> frequency1 = new HashMap<>();
        Map<String, Integer> frequency2 = new HashMap<>();
        int count = 0;
        for (String str : words1) {
            frequency1.put(str, frequency1.getOrDefault(str, 0) + 1);
        }
        for (String str : words2) {
            frequency2.put(str, frequency2.getOrDefault(str, 0) + 1);
        }
        for (String str : words1) {
            if (frequency1.get(str) == 1 && frequency2.getOrDefault(str, 0) == 1) {
                count++;
            }
        }
        return count;
    }
}
