class Solution {
    public int longestConsecutive(int[] nums) {
        int n= nums.length;
        int longest=0;
        Map<Integer,Boolean> m = new HashMap<>();
        for(int num:nums){
            m.put(num,Boolean.FALSE);
        }
        for(int num:nums){
            int currentlength=1;
            int nextnum=num +1;
            while(m.containsKey(nextnum) && m.get(nextnum)== false){
                currentlength++;
                m.put(nextnum,Boolean.TRUE);
                nextnum++;
            }
            int prevnum=num-1;
            while(m.containsKey(prevnum) && m.get(prevnum) == false ){
                currentlength++;
                m.put(prevnum, Boolean.TRUE);
                prevnum--;
            }
            longest= Math.max(longest, currentlength);
        }
        return longest;
        
    }
}