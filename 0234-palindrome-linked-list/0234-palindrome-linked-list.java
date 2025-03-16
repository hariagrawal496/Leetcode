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
        List<Integer> list = new ArrayList<>() ;
        ListNode curr = head ;

        while(curr != null)
        {
            list.add(curr.val) ;
            curr = curr.next ;
        }

        int s = 0 ;
        int e = list.size()-1 ;

        while( s<= e)
        {
            if(list.get(s) != list.get(e))
            {
                return false ;
            }

            s++ ;
            e-- ;
        }

        return true ;
    }
}