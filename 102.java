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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
                List<Integer> l = new ArrayList<>();
            while(n > 0){
                TreeNode nn = q.poll();
                if(nn.left !=null){
                    q.add(nn.left);
                }
                if(nn.right != null){
                    q.add(nn.right);
                }
                l.add(nn.val);
                n--;
            }
            list.add(new ArrayList<>(l));
        }
        return list;
    }
}