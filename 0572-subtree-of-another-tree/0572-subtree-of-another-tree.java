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

        boolean leftRoot = isSubtree(root.left , subRoot ) ;
        boolean rightRoot = isSubtree(root.right , subRoot) ;
 
       if( leftRoot == true ||  rightRoot == true )
       {
         return true ;
       }
     return false  ;
    }

    public static boolean checkSameTree(TreeNode p , TreeNode q)
    {
        if(p == null && q == null)
        {
            return true ;
        }
        
        if((p == null && q != null) || (p != null && q == null) || (p.val != q.val))
        {
            return  false ;
        }
     
        boolean leftSide = checkSameTree(p.left , q.left) ;
        boolean rightSide = checkSameTree(p.right , q.right) ;

        if(leftSide == false || rightSide == false)
        {
            return false ;
        }

        return true ;
    }


}