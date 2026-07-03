package pdpuz.Solution42;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

public class linkedlist {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println(reverse(head));
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node nextTemp = current.next; // keyingisini saqlab qo'yamiz
            current.next = prev;          // yo'nalishni teskariga o'zgartiramiz
            prev = current;               // prevni oldinga suramiz
            current = nextTemp;           // keyingiga o'tamiz
        }

        return prev; // yangi head
    }
}