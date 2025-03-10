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
    public ListNode reverseList(ListNode head) 
    {
        if(head == null)
        {
            return null ;
        }

        ListNode prev = null ;
        ListNode curr = head ;
        ListNode next = null ;

        while(curr != null)
        { 
            next = curr.next ; // 2 3 4 5 null
            curr.next = prev ; // null 1 2 3 4

            prev = curr ; //  1 2 3 4 5
            curr = next ; //  2 3 4 5 null
        }

         head = prev ;
         
        return head ;
    }
}