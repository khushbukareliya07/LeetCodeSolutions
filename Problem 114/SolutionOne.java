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
class SolutionOne {
    public void flatten(TreeNode root) {
        
        //base case
        if(root  == null) return;
        //recursion case
        
        TreeNode tmp_left = root.left;
        TreeNode tmp_right = root.right;
        
        root.left = null;
        
        flatten(tmp_left);
        flatten(tmp_right);
        
        root.right = tmp_left;
        TreeNode current = root;
        
        while(current.right != null)
        {
            current = current.right;
        }
        
        current.right = tmp_right;
        
        
    }
}