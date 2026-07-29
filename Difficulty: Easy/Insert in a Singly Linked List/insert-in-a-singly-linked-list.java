/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertPos(Node head, int pos, int val) {
        // code here
        Node p;
        p=head;
        Node q=new Node(val);
        if(head==null)
        {
            return  q;
        }
        if(pos==1)
        {
            q.next=p;
            return q;
        }
        for(int i=1;i<pos-1;i++)
        {
            p=p.next;
        }
        q.next=p.next;
        p.next=q;
        return head;
    }
}