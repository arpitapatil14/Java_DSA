class Solution {
    public int minimizedStringLength(String s) {
        Set<Character> st= new HashSet<>();
        for(int i=0;i<s.length();i++){
           st.add(s.charAt(i));
        }
        return st.size();
        
    }
}