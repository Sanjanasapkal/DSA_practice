class Solution {
    public Node addTwoLists(Node head1, Node head2) {

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        Node p = head1;

        while (p != null) {
            s1.push(p.data);
            p = p.next;
        }

        p = head2;

        while (p != null) {
            s2.push(p.data);
            p = p.next;
        }

        Node head = null;
        int carry = 0;

        while (!s1.isEmpty() || !s2.isEmpty() || carry != 0) {

            int sum = carry;

            if (!s1.isEmpty()) {
                sum += s1.pop();
            }

            if (!s2.isEmpty()) {
                sum += s2.pop();
            }

            int digit = sum % 10;
            carry = sum / 10;

            Node newNode = new Node(digit);
            newNode.next = head;
            head = newNode;
        }
        
        while(head!=null && head.data==0 && head.next!=null)
        {
            head=head.next;
        }

        return head;
    }
}