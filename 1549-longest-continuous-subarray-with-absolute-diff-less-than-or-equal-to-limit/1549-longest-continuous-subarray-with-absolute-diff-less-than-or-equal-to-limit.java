class Solution {
    public int longestSubarray(int[] nums, int limit) {
        ArrayDeque<Integer> max = new ArrayDeque<>();
        ArrayDeque<Integer> min = new ArrayDeque<>();
        int i = 0, res = 0;
        
        for (int j = 0; j < nums.length; j++) {
            while (!max.isEmpty() && nums[j] > max.peekLast()) {
                max.pollLast();
            }
            while (!min.isEmpty() && nums[j] < min.peekLast()) {
                min.pollLast();
            }
            max.offerLast(nums[j]);
            min.offerLast(nums[j]);
            
            while (max.peekFirst() - min.peekFirst() > limit) {
                if (max.peekFirst() == nums[i]) {
                    max.pollFirst();
                }
                if (min.peekFirst() == nums[i]) {
                    min.pollFirst();
                }
                i++;
            }
            
            res = Math.max(res, j - i + 1);
        }
        
        return res;
    }
}