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
    public List<Integer> rightSideView(TreeNode root) 
    {
        List<Integer> list = new ArrayList<>() ;
         
        if(root == null)
        {
            return list ;
        }

        Queue<TreeNode> q = new LinkedList<>() ;
        q.add(root) ;

        while(!q.isEmpty())
        {
            int len = q.size() ;
            boolean flag = true ;

            for(int i=0; i<len ; i++)
            {
                TreeNode node = q.remove() ;
                if(flag == true)
                {
                    list.add(node.val) ;
                    flag = false ;
                }

                if(node.right != null)
                {
                    q.add(node.right) ;
                }

                if(node.left != null)
                {
                    q.add(node.left) ;
                }
            }
        }
        return list ;
    }
}