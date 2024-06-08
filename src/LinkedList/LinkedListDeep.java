package LinkedList;

import java.util.Stack;

public class LinkedListDeep {

    private Node head;
    private Node tail;

    private int size;

    public LinkedListDeep() {
        this.size = 0;
    }

    private class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertFrist(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int val) {

        if (tail == null) {
            insertFrist(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;

    }

    public void insertAtPosition(int val, int index) {

        if (index == 0) {
            insertFrist(val);
            return;
        }

        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        size+=1;
        temp.next = new Node(val, temp.next);

    }

    public int deleteFirst() {
        int val = head.value;

        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;

        return val;
    }

    public int deleteLast() {

        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;

        return val;
    }

    public int deleteAtPosition(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if(index == size-1) {
            return deleteLast();
        }

        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size-=1;
        return val;

    }

    public Node get(int index) {

        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;

    }
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + "-");
            temp = temp.next;
        }

        System.out.println("End");

    }

    public void printReverse() {

        Node temp = head;

        Stack<Node> stack = new Stack<>();

        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop().value + "-");
        }

        System.out.println("End");

    }
}
