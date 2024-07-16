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


    static boolean find(TreeNode root, int a, StringBuilder s){
        if(root.val==a) return true;
        if(root.left!=null && find(root.left,a,s)){
            s.insert(0,"L");
        }else if(root.right!=null && find(root.right,a,s)){
            s.insert(0,"R");
        }

        return s.length()>0;
    }

    public String getDirections(TreeNode root, int s, int d) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        find(root,s,s1);
        find(root,d,s2);
      
        int i=0;
        int j=0;
      
        while(i<s1.length() && j<s2.length() && s1.charAt(i)==s2.charAt(j)){
            i++;
            j++;
        }

        s1 = new StringBuilder(s1.toString().substring(i));
        s2 = new StringBuilder(s2.toString().substring(j));
        
        StringBuilder ans = new StringBuilder();
        ans.append("U".repeat(s1.length()));
        ans = ans.append(s2.toString());
        return ans.toString();
    }
}