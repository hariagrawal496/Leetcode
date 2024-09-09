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
    public int getMinimumDifference(TreeNode root) 
    {
        List<Integer> list = new LinkedList<>() ;
        int ans = Integer.MAX_VALUE ;
        inOrder(root , list) ;

        if(list.size() == 1)
        {
            return list.get(0) ;
        }
  
        for(int i=1; i<list.size(); i++)
        {
            ans = Math.min( ans, Math.abs(list.get(i)-list.get(i-1)) );
        }
        return ans ;
    }

    public void inOrder(TreeNode root ,List<Integer> list)
    {
         if(root == null)
         {
            return ;
         }

        inOrder(root.left , list) ;
        list.add(root.val);
        inOrder(root.right , list) ;
    }
}