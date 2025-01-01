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
        Stack<ListNode> stack = new Stack<>() ;
        ListNode curr = head ;

        while(curr != null)
        {
            stack.add(curr) ;
            curr = curr.next ;
        }

        curr = head ;
        while(!stack.isEmpty())
        {
            ListNode node = stack.pop() ;
            if(node.val != curr.val)
            {
               return false ;
            }
            curr = curr.next ;
        }
        return true ;
    }
}