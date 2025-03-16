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
        List<Integer> list = new LinkedList<>() ;
        ListNode curr = head ;

        while(curr != null)
        {
            list.add(curr.val) ;
            curr = curr.next ;
        }
       
        int s = 0 ;
        int e = list.size()-1 ;

        while (s <= e)
        {
            int temp = list.get(s) ;
            int val = list.get(e) ;

            list.set(s, val) ;
            list.set(e, temp) ;

            s++ ;
            e-- ;
        }

        ListNode res = new ListNode(-1) ;
        ListNode node = res ; 

      for(int i=0; i<list.size(); i++)
      {
         node.next = new ListNode(list.get(i)) ;
         node = node.next ;
      }

    return res.next ;
    }
}