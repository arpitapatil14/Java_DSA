class Solution {
    public int minimumPushes(String word) {
        Integer[] chFreq = new Integer[26];
        Arrays.fill(chFreq, 0);
        for (char ch : word.toCharArray()) {
            chFreq[ch - 'a']++;
        }
        Arrays.sort(chFreq, Collections.reverseOrder());
        int ans = 0;
        int digitUsed = 0;
        for (int freq : chFreq) {
            ans += (digitUsed / 8 + 1) * freq;
            digitUsed++;
        }
        return ans;
    }
}    