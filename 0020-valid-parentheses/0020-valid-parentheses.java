import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if (s.length() == 1) {
            return false;
        }
        Stack<Character> ans = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                ans.push(')');
            } else if (c == '{') {
                ans.push('}');
            } else if (c == '[') {
                ans.push(']');
            } else {
                if (ans.isEmpty() || ans.pop() != c) {
                    return false;
                }
            }
        }
        
        return ans.isEmpty();
    }
}
