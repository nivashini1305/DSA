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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;
        
        while(even != null && even.next!=null)
        {
            odd.next = even.next;     // Link odd to next odd
            odd = odd.next;           // Move odd forward

            even.next = odd.next;     // Link even to next even
            even = even.next;  
        }
        odd.next = evenHead;

        return head;
    }
}