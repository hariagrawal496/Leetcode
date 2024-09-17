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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) 
    {
        if(subRoot == null)
        {
            return true ;
        }

        if(root == null)
        {
            return false ;
        }

        if(checkSameTree(root , subRoot))
        {
            return true ;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot) ;
    }

    public boolean checkSameTree(TreeNode p , TreeNode q )
    {
         if( p == null && q == null)
         {
            return true ;
         }

         if( p == null && q != null || p != null && q == null || p.val != q.val)
         {
            return false ;
         }

         return checkSameTree(p.left, q.left) && checkSameTree(p.right, q.right) ;
    }
}