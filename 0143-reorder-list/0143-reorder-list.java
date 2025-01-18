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
    public void reorderList(ListNode head) 
    {
        if(head == null || head.next == null || head.next.next == null)
        {
            return ;
        }

        ListNode fast = head ;
        ListNode slow = head ;

        while(fast != null && fast.next != null)
        {
            slow = slow.next ;
            fast = fast.next.next ;
        }
         
        ListNode rev = reverse(slow.next) ;  // reverse second half  // rev -> 5 4
         slow.next = null ; // head -> 1 2 3
       

        ListNode node = new ListNode(-1) ; // -1
      
        while(head != null && rev != null)
        {
           node.next = head ; // 1 -> 1 5 2
           node = node.next ;
           head = head.next ; // 2  -> 3

           node.next = rev ; // 1 5 -> 1 5 2 4
           node = node.next ; 
           rev = rev.next ; // 4 null
        }

        if(head != null)
        {
            node.next = head ; // 1 5 2 4 3
        }

        head = node.next ;
    }

    public static ListNode reverse(ListNode head)
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
             next = curr.next ;
             curr.next = prev ;

             prev = curr ;
             curr = next ;
        }
       return prev ;
    }
}