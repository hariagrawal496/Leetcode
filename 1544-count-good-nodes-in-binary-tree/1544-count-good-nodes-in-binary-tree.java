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

        return countGoodNodes(root, root) ;
    }

    public int countGoodNodes(TreeNode root,TreeNode node)
    {
         if(root == null)
         {
            return 0 ;
         }

         int count = 0 ;
         if(root.val >= node.val)
         {
            count++ ;
            node = root ;
         }

         count += countGoodNodes(root.left, node);
         count += countGoodNodes(root.right, node);
     
     return count ;
    }
}