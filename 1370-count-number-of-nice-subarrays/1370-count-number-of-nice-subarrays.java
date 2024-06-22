class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int oddCount = 0; // Count of odd  in the current window
        int prevCount = 0; // Number of valid subarays end at the previous index
        int result = 0; 
        int start = 0;    
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] % 2 != 0) {
                oddCount++;
                prevCount = 0; 
            }
            
            while (oddCount == k) {
                prevCount++;
                if (nums[start] % 2 != 0) {
                    oddCount--;
                }
                start++;
            }
            
            result += prevCount;
        }
        
        return result;
    }
}
