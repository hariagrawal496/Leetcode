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
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> list = new ArrayList<>() ;

        if(root == null)
        {
            return list ;
        }
        
        Queue<TreeNode> q = new LinkedList<>() ;
          q.add(root) ;

          while(!q.isEmpty())
          {
             int len = q.size() ;
             List<Integer> data = new ArrayList<>() ;

             for(int i=0; i<len ; i++)
             {
                TreeNode node = q.remove() ;
                data.add(node.val) ;

                if(node.left != null)
                {
                    q.add(node.left) ;
                }

                if(node.right != null)
                {
                    q.add(node.right) ;
                }
             }           
            list.add(data) ;
          }
     return list ;
    }
}