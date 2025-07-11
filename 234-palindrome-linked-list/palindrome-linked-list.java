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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = reverse(slow.next);
        ListNode frst = head;
        ListNode scnd = newHead;
        while (scnd != null)
        {
            if(frst.val != scnd.val)
            {
               reverse(newHead);
               return false; 
            } 
            frst = frst.next;
            scnd = scnd.next;
        }
        reverse(newHead);
        return true;

    }
        ListNode reverse(ListNode head)
        {
            if(head == null || head.next == null)
            {
                return head;
            }
            ListNode newHead = reverse(head.next);
            ListNode front = head.next;
            front.next = head;
            head.next = null;
            return newHead;
            }
}