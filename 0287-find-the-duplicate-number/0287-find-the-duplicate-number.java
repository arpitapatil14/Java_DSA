class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        // intersection point 
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        // entrance to the cycle.
        fast= nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}
