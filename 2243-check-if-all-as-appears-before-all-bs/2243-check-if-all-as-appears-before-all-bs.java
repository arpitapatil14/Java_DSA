class Solution {
    public boolean checkString(String s) {
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            char current= s.charAt(i);
            if(current=='b'){
                st.push(current);
            }else if( current=='a' && !st.isEmpty() && st.peek()=='b'){
                return false;
            }
        }
        return true;
    }
}
