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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        return helper(root, result);
    }

    private List<Integer> helper(TreeNode node, List<Integer> list) {
        if (node == null) return list;
        list.add(node.val);          
        helper(node.left, list);     
        helper(node.right, list);    

        return list;
    }
}
