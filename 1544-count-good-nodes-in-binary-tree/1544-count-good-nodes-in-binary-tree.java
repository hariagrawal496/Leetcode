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
    public int goodNodes(TreeNode root) 
    {
        if(root == null)
        {
            return 0 ;
        }

       return checkCount(root, root.val) ;
    }

    public int checkCount(TreeNode root, int max)
    {
        if(root == null)
        {
            return 0 ;
        }

        int count = 0 ;

       if(root.val >= max)
       {
          count++ ;
          max = Math.max(max, root.val) ;
       }

      count += checkCount(root.left, max) ;
      count += checkCount(root.right, max) ;

      return count ;
    }
}