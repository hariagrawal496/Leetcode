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
    public ListNode reverseBetween(ListNode head, int left, int right) 
    {
        if(left == right)
        {
            return head ;
        }
        
        ListNode res = new ListNode(-1) ; // -1 ....
        ListNode prev = res ; // -1 ....
        res.next = head ; // -1 1 2 3 4 5

        for(int i=0; i<left-1; i++) // 0 to 1
        {  
            prev = prev.next ; // prev -> 1
        }

        ListNode curr = prev.next ; // curr -> 2
        
        for(int i=0; i<right-left; i++)
        {    
            ListNode temp = curr.next ; // temp -> 3 4
            curr.next = temp.next ; // 2.next -> 3.next, 3.next-> 4.next,
            temp.next = prev.next ; // 3.next -> 1.next ,  
            prev.next = temp ; // 1.next -> 3
        }
   
      return res.next ;
    }
}