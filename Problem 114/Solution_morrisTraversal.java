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
class Solution_morrisTraversal {
    public void flatten(TreeNode root) {
        
       //base case   
        if(root == null)
            return;
        
        //iterating through tree
        while(root != null)
        {
            //we check if it has left root
            if(root.left != null)
            {//we assign the node value to temp var. 
                TreeNode left =  root.left;
                TreeNode curr = root.left;
                
                //we check for the right node null or not
                while(curr.right != null)
                {
                    curr = curr.right;
                }
                curr.right = root.right;
                //assigning root 's left to null 
                root.left =null;
                
                //& assigning main values to the right pointer of root
                root.right = left;
            }
            //if tree doesn't have any left node or if we are done oterating through left node , then we assign the current node's right pointer to root's right!
            root= root.right;
        }
        
    }
}   