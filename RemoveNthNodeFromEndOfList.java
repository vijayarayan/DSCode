Given a linked list, remove the n-th node from the end of list and return its head.

Example:

Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:

Given n will always be valid.

Follow up:

Could you do this in one pass?
***************************************************************************************


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode prev = null;
        ListNode  first = head;
        ListNode  second = head;
        int count = 0;
        
        if (( head == null) || n < 0 )
            return null;
       //First and second both pointing to head, move second till the tail 
        while ( second.next !=null) {
            count++;
            if(count >= n){ //move first only after n moves
                prev = first;
                first = first.next;
            }
          second= second.next;
                       
          }
        
        //case when tail reached and gap of n move is maintained
        if(count >= n) {    
            if(second.next ==null  ){
               prev.next = first.next;
            }
        }
        
        //Case when tail is reached before the N move 'gap'( in this case gap is shy by 1 move )
        if( n - count ==1){
            head = first.next;
        }
        
    return head;
 }
}