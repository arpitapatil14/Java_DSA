class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> mp= new TreeMap<>();
        for(int i=0;i<names.length;i++){
            mp.put(heights[i],names[i]);
        }
        int index=names.length-1;
        String[] ans= new String[names.length];
        for(String name: mp.values()){
            ans[index]=name;
            index--;
        }
        return ans;
        
    }
}