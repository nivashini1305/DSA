/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}*/

class Solution {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        // Your code here
        int count=-1;
        Node temp=head;
        while(temp.next != null)
        {
            count+=1;
            if(count==p)
            {
                break;
            }
            temp=temp.next;
        }
        Node front = temp.next;
        Node newNode = new Node(x);
        newNode.next = front;
        newNode.prev = temp;
        temp.next = newNode;
        return head;
    }
}