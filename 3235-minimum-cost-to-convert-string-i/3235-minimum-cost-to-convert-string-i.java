class Solution {
    public long minimumCost(String source, String target, char[] original, 
    char[] changed, int[] cost) {
       
        int g[][] = new int[26][26];
        for(int i =0;i<26;i++){
            Arrays.fill(g[i],(int)(1e9));
        }
       
        for(int i =0;i<original.length;i++){
            int a = original[i]-'a';
            int b = changed[i] - 'a';
            if(g[a][b] > cost[i]){
                g[a][b] = cost[i];
            }
        }
        for(int i =0;i<26;i++){
            for(int j =0;j<26;j++){
                if(i == j){
                    g[i][j] =0;
                }
               
            }
        }
        for (int k = 0; k < 26; k++) {
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < 26; j++) {
                    g[i][j] = Math.min(g[i][j], g[i][k] + g[k][j]);
                }
            }
        }
        long ans = 0;
        for(int i =0;i<source.length();i++){
           if(source.charAt(i) != target.charAt(i)){
                int a = source.charAt(i)-'a';
                int b = target.charAt(i) - 'a';
                if(g[a][b] == (int)(1e9) ){
                    return -1;
                }else{
                    ans+=g[a][b];
                }
           }
        }
        return ans;
    }
}