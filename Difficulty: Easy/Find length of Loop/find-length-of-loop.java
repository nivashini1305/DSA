/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // code here.
        Node slow = head;
        Node fast = head;
        int count=0;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                count = length(slow,fast);
                return count;
            }
        }
        return 0;
    }
    int length(Node slow,Node fast)
    {
        int count=1;
        fast = fast.next;
        while(slow != fast)
        {
            count++;
            fast = fast.next;
        }
        return count;
    }
}