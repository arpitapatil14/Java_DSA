/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>l=new ArrayList<>();

        solve(root,l);
        return l;
        
    }

    public void solve(TreeNode n,List<Integer>l)
    {
        if(n==null)
        return ;
        solve(n.left,l);
        solve(n.right,l);
        l.add(n.val);
    }
}