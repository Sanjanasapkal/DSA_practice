/* Structure of Linked List Node
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        Node p;
        p=head;
        if(p==null || p.next==null)
        return null;
        
        if(x==1)
        {
            head=p.next;
        }
        
        for(int i=1;i<x-1;i++)
        {
            p=p.next;
        }
        p.next=p.next.next;
        
        return head;
    }
}