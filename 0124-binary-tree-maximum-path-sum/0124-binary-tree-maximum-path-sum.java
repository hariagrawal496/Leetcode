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

 public int max = Integer.MIN_VALUE ;

    public int maxPathSum(TreeNode root) 
    {  
        sumPath(root) ;
        return max ;
    }

    public int sumPath(TreeNode root)
    {
        if(root == null)
        {
            return 0 ;
        }

        int left  = Math.max(0, sumPath(root.left)) ;
        int right = Math.max(0, sumPath(root.right)) ;
        int rootSum = left + right + root.val ;

        max = Math.max(max , rootSum) ;
        return root.val + Math.max(left, right) ;
    }
}