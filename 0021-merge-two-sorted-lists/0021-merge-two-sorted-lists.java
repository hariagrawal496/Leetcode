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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        ListNode node = new ListNode(-1);
        ListNode curr = node;

        while(list1 != null && list2 != null)
        {
            if(list1.val > list2.val)
            {
                curr.next = list2 ;
                list2 = list2.next ;
            }
            else
            {
                curr.next = list1 ;
                list1 = list1.next ;
            }       
           curr = curr.next ;
        }

        if(list1 == null)
        {
            curr.next = list2;
        }
        else
        {
            curr.next = list1;
        }
        
        return node.next ;
    }
}