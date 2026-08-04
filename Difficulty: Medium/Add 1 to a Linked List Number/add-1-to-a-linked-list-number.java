/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {

    public Node recursive(Node p, Node head) {

        Node q = head;
        if (p == head) {
            Node newNode = new Node(1);
            newNode.next = head;
            return newNode;
        }

        while (q.next != p) {
            q = q.next;
        }
        if (q.data == 9) {
            q.data = 0;
            return recursive(q, head);
        } 
        else {
            q.data++;
            return head;
        }
    }

    public Node addOne(Node head) {

        if (head == null) {
            return new Node(1);
        }

        Node p = head;

        while (p.next != null) {
            p = p.next;
        }

        if (p.data == 9) {
            p.data = 0;
            return recursive(p, head);
        } 
        else {
            p.data++;
        }

        return head;
    }
}
