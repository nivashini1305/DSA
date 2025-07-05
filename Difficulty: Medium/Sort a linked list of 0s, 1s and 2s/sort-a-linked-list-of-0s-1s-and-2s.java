/* class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}*/
class Solution {
    static Node segregate(Node head) {
        // code here
        // if(head == null)
        // {
        //     return null;
        // }
        if(head.next == null)
        {
            return head;
        }
        Node temp = head;
        Node zerohead = new Node(-1);
        Node onehead  = new Node(-1);
        Node twohead  = new Node(-1);
        Node zero = zerohead;
        Node one  = onehead;
        Node two  = twohead;
        while(temp != null)
        {
            if(temp.data == 0)
            {
                zero.next = temp;
                zero = zero.next;
            }
            else if(temp.data == 1)
            {
                one.next = temp;
                one = one.next;
            }
            else
            {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }
        if(onehead.next != null)
        {
            zero.next = onehead.next;
        }
        else
        {
            zero.next = twohead.next;
        }
        one.next = twohead.next;
        two.next =null;
        Node newHead = zerohead.next;
        return newHead;
        
    }
}