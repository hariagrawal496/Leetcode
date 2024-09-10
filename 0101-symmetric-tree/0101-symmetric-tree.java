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
    public boolean isSymmetric(TreeNode root) 
    {
        if(root == null)
        {
            return true ;
        }

        return checkSame(root.left , root.right) ;
    }

    public boolean checkSame(TreeNode leftRoot , TreeNode rightRoot)
    {
          if(leftRoot == null && rightRoot == null)
          {
            return true ;
          }

          if((leftRoot != null && rightRoot == null) || (leftRoot == null && rightRoot != null))
          {
            return false ;
          }

          if(leftRoot.val != rightRoot.val)
          {
             return false ;
          }

          return checkSame(leftRoot.left , rightRoot.right) && checkSame(leftRoot.right , rightRoot.left) ;
    }
 
}