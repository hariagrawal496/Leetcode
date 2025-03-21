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
       Set<ListNode> list = new HashSet<>() ;
       ListNode curr = head ;

       while(curr != null)
       {
            if(list.contains(curr))
            {
                return true ;
            }

            list.add(curr) ;
            curr = curr.next ;
       }
     return false ;
    }
}