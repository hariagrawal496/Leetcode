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
    public boolean isSameTree(TreeNode p, TreeNode q)
    {
        if(q == null && p == null)
        {
            return true ;
        }
       
        if((q == null && p != null) || (q != null && p == null) || (p.val != q.val))
        {
            return false ;
        }

        boolean leftSide = isSameTree(p.left , q.left) ;
        boolean rightSide = isSameTree(p.right , q.right) ;

        if(leftSide == false || rightSide == false)
        {
            return false ;
        }
        return true ;
    }
}