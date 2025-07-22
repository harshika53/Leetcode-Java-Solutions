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
    boolean height = true;
    public boolean isBalanced(TreeNode root) {
        toCheck(root);
        return height;
    }

     public int toCheck(TreeNode root){
            if(root == null){
            return 0;
        }
          int left = toCheck(root.left);
          int right = toCheck(root.right);
          if (Math.abs(left-right)>1){
              height = false;
        }
        return Math.max(left, right)+1;
    }
}