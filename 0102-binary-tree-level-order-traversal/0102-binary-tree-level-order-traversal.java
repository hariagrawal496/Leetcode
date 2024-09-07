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
         if (root == null) 
         {
            return list;
         }

        Queue<TreeNode> q = new LinkedList<>() ;
        q.add(root) ;
       
        while(!q.isEmpty())
        {
            int length = q.size() ;
            List<Integer> data = new ArrayList<>() ;

            while(length-- > 0)
            {
                TreeNode newNode = q.remove() ;
                data.add(newNode.val) ;

                if(newNode.left != null)
                {
                    q.add(newNode.left) ;
                }    

                if(newNode.right != null)
                {
                    q.add(newNode.right) ;
                }
            }  
            list.add(data) ;  
        }
    return list ;
    }
}