class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        return helper(root, result);
    }

    private List<Integer> helper(TreeNode node, List<Integer> list) {
        if (node == null) return list;
        helper(node.left, list);     
        list.add(node.val);          
        helper(node.right, list);    

        return list;
    }
}
