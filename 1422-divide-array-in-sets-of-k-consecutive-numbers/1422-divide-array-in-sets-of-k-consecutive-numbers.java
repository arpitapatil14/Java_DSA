import java.util.TreeMap;

class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        int n = nums.length;
        if (n % k != 0) {
            return false;
        }

        TreeMap<Integer, Integer> ans = new TreeMap<>();
        for (int num : nums) {
            ans.put(num, ans.getOrDefault(num, 0) + 1);
        }

        while (!ans.isEmpty()) {
            int cur = ans.firstKey();
            for (int i = 0; i < k; i++) {
                int card = cur + i;
                if (ans.getOrDefault(card, 0) == 0) {
                    return false;
                }
                ans.put(card, ans.get(card) - 1);
                if (ans.get(card) == 0) {
                    ans.remove(card);
                }
            }
        }
        return true;
    }
}
