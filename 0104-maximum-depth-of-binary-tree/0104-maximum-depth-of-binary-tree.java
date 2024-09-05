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
    public int maxDepth(TreeNode root) 
    {
        if(root == null)
        {
            return 0 ;
        }

        int leftSide = maxDepth(root.left) ;
        int rightSide = maxDepth(root.right) ;
        int len = Math.max(leftSide , rightSide) + 1 ;

        return len ;
    }
}