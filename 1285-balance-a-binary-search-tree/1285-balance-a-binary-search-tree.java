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
    public TreeNode balanceBST(TreeNode root) {
         List<Integer> vec = new ArrayList<>();
        inOrder(root, vec);
        return construct(0, vec.size() - 1, vec);
        
    }
     private void inOrder(TreeNode root, List<Integer> vec) {
        if (root == null) {
            return;
        }
        inOrder(root.left, vec);
        vec.add(root.val);
        inOrder(root.right, vec);
    }

    private TreeNode construct(int l, int r, List<Integer> vec) {
        if (l > r) {
            return null;
        }
        int mid = l + (r - l) / 2;
        TreeNode root = new TreeNode(vec.get(mid));
        root.left = construct(l, mid - 1, vec);
        root.right = construct(mid + 1, r, vec);
        return root;
    }
}