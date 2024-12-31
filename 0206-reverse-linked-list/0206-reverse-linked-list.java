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
        Stack<ListNode> stack = new Stack<>() ;
        ListNode currNode = head ;

        while(currNode != null)
        {
            stack.add(currNode) ;
            currNode = currNode.next ;
        }

        ListNode res = new ListNode(-1) ;
         currNode = res ;
           
        while(!stack.isEmpty())
        {
            currNode.next = stack.pop() ;
            currNode = currNode.next ;
        }
        currNode.next = null ;

      return res.next ;
    }

}