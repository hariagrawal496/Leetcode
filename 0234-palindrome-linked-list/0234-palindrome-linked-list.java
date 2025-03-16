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
        ListNode curr = head ;
        int count = 0 ;
        while(curr != null)
        {
            count++ ;
            curr = curr.next ;
        }

        ListNode slow = head ;
        ListNode fast = head ;
        count = count/2 ;

        while(count-- != 0)
        {
            slow = slow.next ;
        }

        slow = reverse(slow) ;

        while(slow != null)
        {
            if(slow.val != fast.val)
            {
                  return false ;
            }

            slow = slow.next ;
            fast = fast.next ;
        }
  
     return true ;
    }

    public ListNode reverse(ListNode  head)
    {
        ListNode prev = null ;
        ListNode curr = head ;
        ListNode next = null ;

        while(curr != null)
        {
            next = curr.next ;          
            curr.next = prev ;
            prev =  curr ;
            curr = next ;
        }

        return prev ;
    }
}