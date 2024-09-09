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
    public boolean hasPathSum(TreeNode root, int targetSum) 
    {
     int sum = 0 ;
     return sumPath(root, targetSum , sum) ;  
    }

    public boolean sumPath(TreeNode root, int targetSum , int sum) 
    {
         if(root == null)
         {
            return false ;
         }

          sum += root.val ;
         if((root.left == null) && (root.right == null) && (sum == targetSum))
         {
            return true  ;
         }
        
        return sumPath(root.left, targetSum , sum) || sumPath(root.right, targetSum , sum) ;
    }
}