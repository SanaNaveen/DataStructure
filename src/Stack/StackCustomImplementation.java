/*
* stack custom implementation
*
* */
package Stack;

class Node {
    int data;

    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

class StackImpl {

    private Node top;

    StackImpl() {
        this.top = null;
    }

    public void push(int val) {

        Node node = new Node(val);
        node.next = top;
        top = node;
    }

    public void display() {
        Node currentNode = top;
        while (currentNode != null) {
            System.out.print(currentNode.data + "-");
            currentNode = currentNode.next;
        }
        System.out.println("Empty");
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return  top.data;
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return -1;
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }

}

public class StackCustomImplementation {

    public static void main(String[] args) {

        StackImpl stack = new StackImpl();

        stack.push(10);
        stack.push(20);

        stack.display();

        System.out.println(stack.isEmpty());

        System.out.println(stack.peek());

        stack.display();

        System.out.println(stack.pop());

        stack.display();
    }

}
