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

    private int max = Integer.MIN_VALUE ;
    public int maxPathSum(TreeNode root) 
    {
        if(root == null)
        {
            return 0 ;
        }

        sum(root) ;
        return max ;
    }

    public int sum(TreeNode root)
    {
        if(root == null)
        {
            return 0 ;
        }

        int leftSum  = Math.max(0, sum(root.left)) ;
        int rightSum = Math.max(0, sum(root.right)) ;

        int rootSum = leftSum + rightSum + root.val ;
        max = Math.max(rootSum , max) ;

        return root.val + Math.max(leftSum, rightSum) ;
    }
}