class Solution {
    public void dfs(int node,int idx,List<List<Integer>> adj,List<List<Integer>> ans,boolean vis[]){
        vis[idx]=true;
        for(int i:adj.get(idx)){
            if(!vis[i]){
                ans.get(i).add(node);
                dfs(node,i,adj,ans,vis);
            }
        }
    }
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
            ans.add(new ArrayList<>());
        }
        for(int i[]:edges){
            adj.get(i[0]).add(i[1]);
        }

        for(int i=0;i<n;i++){
            dfs(i,i,adj,ans,new boolean[n]);
        }
        
        return ans;
    }
}