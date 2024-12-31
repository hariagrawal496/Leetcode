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
    public boolean isPalindrome(ListNode head) 
    {
         if(head == null || head.next == null)
         {
            return true ;
         }

        ListNode slow = head ;
        ListNode fast = head ;

        while(fast != null && fast.next != null)
        {
            fast = fast.next.next ;
            slow = slow.next ;
        }

        slow = reverse(slow) ;

        while(slow != null && slow.val == head.val)
        {
            slow = slow.next ;
            head = head.next ;
        }
    
       return slow == null ;
    }

    public static ListNode reverse(ListNode head)
    {
         if(head == null || head.next == null)
         {
            return head ;
         }

         ListNode  prev = null ;
         ListNode curr = head ;
         ListNode  next = null ;

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