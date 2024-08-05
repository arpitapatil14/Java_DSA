class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> frequency = new HashMap<>();
        for (String str : arr) {
            frequency.put(str, frequency.getOrDefault(str, 0)+ 1);
        }
        for (String str : arr) {
            if (frequency.get(str) == 1) {
                k--;
            }    
                if (k == 0) {
                    return str;
                }
            
        }
        return ""; 
    }
}
