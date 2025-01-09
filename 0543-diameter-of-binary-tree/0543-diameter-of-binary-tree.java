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

        int rootDiameter = height(root.left) + height(root.right) ;
        int leftDiameter = diameterOfBinaryTree(root.left) ;
        int rightDiameter = diameterOfBinaryTree(root.right) ;
        
        return Math.max(rootDiameter, Math.max(leftDiameter ,rightDiameter )) ;
    }

    public int height(TreeNode root)
    {
        if(root == null)
        {
            return 0 ;
        }

        return Math.max(height(root.left), height(root.right)) + 1 ;
    }
}