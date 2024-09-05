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
    public int diameterOfBinaryTree(TreeNode root) 
    {
        if(root == null)
        {
            return 0 ;
        }
        
       int maxHeight = maxDepth(root.left) + maxDepth(root.right) ;
       int maxDaimeter = Math.max( 
                            diameterOfBinaryTree(root.left) , diameterOfBinaryTree(root.right) ) ;
       return Math.max(maxHeight, maxDaimeter) ;
    }

    public static int maxDepth(TreeNode root)
    {
         if(root == null)
         {
            return 0 ;
         }

         return 1 + Math.max(maxDepth(root.left) , maxDepth(root.right)) ;
    }
}