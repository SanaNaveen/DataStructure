package LinkedList;



public class InsertNodeAtTheHead {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }


    }

    public static void main(String[] args) {

        SinglyLinkedList llist = new SinglyLinkedList();

        int[] data = new int[]{383, 484, 392, 975, 321};

        SinglyLinkedListNode node = null;


        for (int i=0; i<data.length;i++) {

//            SinglyLinkedListNode list_head = insertNodeAtHead(llist.head, data[i]);



            SinglyLinkedListNode list_head = insertNodeAtPosition(llist.head, data[i], 1);

            llist.head = list_head;

        }



        System.out.println("Done");

//        SinglyLinkedListNode list_head = deleteNode(llist.head,  3);

//        llist.head = list_head;


        

//        while (llist.head != null) {
//            System.out.print("- "+llist.head.data);
//            llist.head = llist.head.next;
//        }


    }

    public void insertNode(int nodeData) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);


    }

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {

//        descending order
        SinglyLinkedListNode newHead = new SinglyLinkedListNode(data);
        newHead.next = llist;
        return newHead;


    }

    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {

        SinglyLinkedListNode node = null;
        if(position > 1) {
            insertNodeAtPosition(llist.next, data, position-1);
        } else if(position == 1) {
            node = llist;

            if (node == null) {
                llist = new SinglyLinkedListNode(data);
                node = llist;
            } else {

                while (llist.next != null) {
                    llist = llist.next;
                }
                llist.next = new SinglyLinkedListNode(data);
            }
        }

        return node;
    }

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {



        SinglyLinkedListNode current = llist;

        if (position == 0) {
            return llist.next;
        }

        while (position > 1) {
            current  = current.next;
            position--;
        }

        current.next = current.next.next;


        return llist;

    }

    public static void reversePrint(SinglyLinkedListNode llist) {

        while (llist.next != null) {
            System.out.print("- "+ llist.next);
            llist = llist.next;
        }

    }

}
