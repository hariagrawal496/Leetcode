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
            return list;
        }

        return rightSideView(root , list) ;
    }

    public static List<Integer> rightSideView(TreeNode root , List<Integer> list)
    {
        Queue<TreeNode> q = new LinkedList<>() ;
        q.add(root) ;

        while(!q.isEmpty())
        {
           int len = q.size() ; 
           boolean flag = true ;

            while(len-- > 0)
            {
              TreeNode newNode = q.remove();

                if (flag == true)
                {
                  list.add(newNode.val) ;
                  flag = false ;
                }
                
                if(newNode.right != null)
                {
                  q.add(newNode.right);
                }

                if(newNode.left != null)
                {
                  q.add(newNode.left);
                }
            }
        }
        return list ;
    }
}