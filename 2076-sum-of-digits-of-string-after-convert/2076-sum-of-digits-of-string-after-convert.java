class Solution {
    private String helper(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append((s.charAt(i) - 'a') + 1);
        }
        return sb.toString();
    }

    public int getLucky(String s, int k) {
        String str = helper(s);

        int res = 0;
        while (k-- != 0) {
            res = 0;
            for (int i = 0; i < str.length(); i++) {
                res += (str.charAt(i) - '0');
            }
            str = Integer.toString(res);
        }
        return res;
    }
}