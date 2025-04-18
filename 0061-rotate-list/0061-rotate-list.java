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
    public ListNode rotateRight(ListNode head, int k) 
    {
        if(head == null || head.next == null)
        {
            return head ;
        }

        int count = 1;
        ListNode curr = head  ;

        while(curr.next != null)
        {
            count++ ;
            curr = curr.next ;
        }

          curr.next = head ; //making looping

          k = k%count ;
          int n = count-k ;

          while(n-- != 0)
          {
            curr = curr.next ;
          }
            
            head = curr.next ; // denoting head k shift ahead
            curr.next = null ; // breaking point b\w curr and curr.next for loop exit ;
    
      return head ;
    }
}