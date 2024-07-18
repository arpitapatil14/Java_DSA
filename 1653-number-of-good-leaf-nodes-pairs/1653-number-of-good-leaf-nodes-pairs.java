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
    private int result = 0;

    public int countPairs(TreeNode root, int distance) {
        dfs(root, distance);
        return result;
    }

    private List<Integer> dfs(TreeNode node, int distance) {
        if (node == null) return new ArrayList<>();
        if (node.left == null && node.right == null) {
            List<Integer> leafDistances = new ArrayList<>();
            leafDistances.add(0);
            return leafDistances;
        }

        List<Integer> leftDistances = dfs(node.left, distance);
        List<Integer> rightDistances = dfs(node.right, distance);

        for (int l : leftDistances) {
            for (int r : rightDistances) {
                if (l + r + 2 <= distance) {
                    result++;
                }
            }
        }

        List<Integer> distances = new ArrayList<>();
        for (int d : leftDistances) distances.add(d + 1);
        for (int d : rightDistances) distances.add(d + 1);

        return distances;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, null, new TreeNode(6, null, new TreeNode(7))));
        System.out.println(sol.countPairs(root, 3)); 
    }
}