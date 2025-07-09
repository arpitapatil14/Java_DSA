class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s1= new HashSet<>();
        for(int num: nums1){
            s1.add(num);
        }
        HashSet<Integer> resultSet = new HashSet<>();
        for (int num : nums2) {
            if (s1.contains(num)) {
                resultSet.add(num); 
            }
        } 
        int[] ans = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            ans[i++] = num;
        }

        return ans;
        
        
    }
}