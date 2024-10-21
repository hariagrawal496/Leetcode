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

        TreeNode node = root ;
        return goodNodes(root, node);
    }

    public static int goodNodes(TreeNode root, TreeNode node)
    {
        int count = 0 ;

        if(root == null)
        {
            return 0 ;
        } 

        if(root.val >= node.val)
        {
           count++ ;
           node = root ;
        }
     
       count += goodNodes(root.left, node) ;
       count += goodNodes(root.right, node) ;

       return count ;
    }
}