class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> frequency = new HashMap<>();
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        for (String str : words1) {
            frequency.put(str, frequency.getOrDefault(str, 0) + 1);
        }
        for (String str : words2) {
            frequency.put(str, frequency.getOrDefault(str, 0) + 1);
        }
        List<String> result = new ArrayList<>();
        for (String str : frequency.keySet()) {
            if (frequency.get(str) == 1) {
                result.add(str);
            }
        }
        return result.toArray(new String[0]);
    }
}