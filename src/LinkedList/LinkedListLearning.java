package LinkedList;


class LinkedList {

    Node head;

    LinkedList() {
        this.head = null;
    }

    public void append(Node newNode) {
        Node current = this.head;

        if (current == null) {
            this.head = newNode;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void insert(Node newNode, int index) {

        Node current = this.head;

        if (index == 0) {
            newNode.next = current;
            this.head = newNode;
        } else {
            for (int i = 0; i < index - 1 && current != null; i++) {
                current = current.next;
            }
            if (current != null) {
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }

    public void display() {
        Node current = this.head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public int delete(int index) {
        Node current = this.head;
        Node previous = null;
        int deleteValue = -1;

        if (index == 0) {
            deleteValue = this.head.data;
            this.head = this.head.next;
            return deleteValue;
        } else {
            for (int i = 0; i < index && current != null; i++) {
                previous = current;
                previous.next = current.next;
            }

            if (current != null) {
                deleteValue = current.data;
                previous.next = current.next;
            }
        }

        return deleteValue;
    }

}

public class LinkedListLearning {

    public static void main(String[] args) {

        LinkedList l = new LinkedList();

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        l.append(n1);
        l.insert(n2, 1);
        l.insert(n3, 2);
        l.delete(1);

        l.display();

    }

}
