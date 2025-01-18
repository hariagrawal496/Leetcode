/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) 
    {
        if(head == null )
        {
            return head ;
        }

        ListNode res = new ListNode(-1, head) ;
        ListNode prev = res ;
        ListNode curr = head ;

        while(curr != null)
        {
            if(curr.val == val)
            {
                if(curr.next == null)
                {
                    prev.next = null ;
                }
                else
                {
                    prev.next = curr.next ;
                }
            }
            else
            {
                prev = prev.next ;
            }

         curr = curr.next ;
        }

    return res.next ; 
    }
}