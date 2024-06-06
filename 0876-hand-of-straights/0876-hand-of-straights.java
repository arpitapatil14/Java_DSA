
class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if (n % groupSize != 0) {
            return false;
        }
        TreeMap<Integer, Integer> freq = new TreeMap<>();
        for (int num : hand) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        while (!freq.isEmpty()) {
            int curr = freq.firstKey(); 
            for (int i = 0; i < groupSize; i++) {
                int card = curr + i;
                if (freq.getOrDefault(card, 0) == 0) {
                    return false;
                }
                freq.put(card, freq.get(card) - 1);
                if (freq.get(card) == 0) {
                    freq.remove(card);
                }
            }
        }

        return true;
    }
    }