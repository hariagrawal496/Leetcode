/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) 
    {
        if(head == null)
        {
            return false ;
        }

        ListNode currNode = head ;
        Set<ListNode> set = new HashSet<>() ;

        while(currNode != null)
        {
            if(set.contains(currNode))
            {
                return true ;
            }

            set.add(currNode) ;
            currNode = currNode.next ;
        }
        
   return false ;
    }
}