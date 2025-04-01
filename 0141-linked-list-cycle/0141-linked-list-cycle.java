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
        if(head == null )
        {
            return false ;
        }

        List<ListNode> list = new ArrayList<>() ;
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