package ds.LinkedList;



public class DoublyLinkedList {

    private int length;
    private ListNode head;
    private ListNode tail;

    DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    private boolean isEmpty() {
        return this.length == 0;
    }

    private int length() {
        return this.length;
    }

    private void insertElementsAtTheLast(int data) {
        ListNode newNode = new ListNode(data);
        if(isEmpty()) {
            this.head = newNode;
        } else {
            this.tail.next = newNode;
            newNode.previous = this.tail;
        }
        this.tail = newNode;
        this.length++;

    }

    private void insertElementsAtTheBeginning(int data) {
        ListNode newNode = new ListNode(data);
        if(isEmpty()) {
            this.tail = newNode;
        } else {
            this.head.previous = newNode;
            newNode.next = this.head;
        }
        this.head = newNode;
        this.length++;
    }

    private void deleteElementAtTheEnd() {
        ListNode temp = tail;
        if(head == tail && this.length == 1) {
           this.head = null;
           this.tail = null;
       } else {
          tail.previous.next = null;
       }
       this.tail = tail.previous;temp.previous = null;
       this.length --;
    }

    private void deleteElementAtTheBeginning() {
        ListNode temp = head;
        if(head == tail && this.length == 1) {
            this.head = null;
            this.tail = null;

        } else {
            head.next.previous = null;
        }
        this.head = head.next;
        temp.next = null;
        this.length --;
    }

    private void printElementsInForwardDirection() {
        if(head == null) {
            return;
        }
        ListNode current = this.head;
        while(current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("null");
    }

    private void printElementsInReverseDirection() {
        if(tail == null) {
            return;
        }
        ListNode current = this.tail;
        while(current != null) {
            System.out.print(current.data + "->");
            current = current.previous;
        }
        System.out.print("null");
           }

    static class ListNode {
        private int data;
        private ListNode previous;
        private ListNode next;

        ListNode(int data) {
            this.data = data;
            this.previous = null;
            this.next = null;
        }
    }

    public static void main(String a[]) {
        DoublyLinkedList dl = new DoublyLinkedList();

//        ListNode one = new ListNode(5);
//        ListNode two = new ListNode(10);
//        ListNode three = new ListNode(15);
//        dl.head = one;
//        one.next = two;
//        two.next = three;

//        dl.printElementsInForwardDirection();
//        dl.printElementsInReverseDirection();

//        dl.insertElementsAtTheLast(5);
//        dl.insertElementsAtTheLast(10);
//        dl.insertElementsAtTheLast(15);
//
//        dl.printElementsInForwardDirection();
//        System.out.println();
//        dl.printElementsInReverseDirection();


        dl.insertElementsAtTheBeginning(5);
        dl.insertElementsAtTheBeginning(10);
        dl.insertElementsAtTheBeginning(15);

        dl.printElementsInForwardDirection();

        dl.deleteElementAtTheBeginning();
        dl.deleteElementAtTheEnd();
        System.out.println();

        dl.printElementsInForwardDirection();

    }
}
