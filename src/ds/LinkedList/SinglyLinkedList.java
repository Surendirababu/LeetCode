package ds.LinkedList;

public class SinglyLinkedList {


    private ListNode head;

    static class ListNode {

        private int data;
        private ListNode next;

        ListNode(int value) {
            this.data = value;
            this.next = null;
        }
    }

    public void printValues() {
        ListNode current = this.head;
        while(current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("null");
    }

    public int lengthOfSinglyLinkedList() {
        if(head == null) {
            return 0;
        }
        ListNode current = this.head;
        int counter  = 0;
        while(current != null) {
            counter++;
            current = current.next;
        }
        return counter;
    }

    public void insertNodeAtTheBeginning(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void insertNodeAtTheEnd(int val) {
        ListNode newNode = new ListNode(val);
        if(head == null) {
            head = newNode;
            return;
        }
        ListNode current = this.head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;

    }

    public void insertNodeAtAnyGivenPosition(int val, int pos) {
        ListNode newNode = new ListNode(val);
        if(pos == 1) {
            newNode.next = this.head;
            this.head = newNode;
        } else {
            ListNode previous = this.head;
            int counter = 1;
            while( counter < pos -1) {
                previous = previous.next;
                counter++;
            }
            ListNode temp = previous.next;
            newNode.next = temp;
            previous.next = newNode;
        }
    }

    public void deleteFirstNode() {
       if(this.head.next == null) {
           this.head = null;
       } else {
           ListNode temp = this.head.next;
           this.head = temp;
       }
    }

    public void deleteLastNode() {

        if(this.head.next == null) {
            this.head = null;
        } else {
            ListNode current = this.head;
            ListNode previous = null;
            while(current.next != null) {
                previous = current;
                current = current.next;
            }
            current = null;
            previous.next = current;
        }
    }

    public void deleteNodeAtAnyGivenPosition(int pos) {
        if(pos == 1) {
            if(this.head.next == null) {
                this.head = null;
            } else {
                ListNode current = this.head;
               ListNode temp = this.head.next;
               this.head = temp;
               current.next = null;
            }
        } else {
            ListNode current = this.head;
            int counter = 1;
            ListNode previous = null;
            while (counter < pos ) {
                previous = current;
                current = current.next;
                counter++;
            }
            previous.next = current.next;
        }
    }

    public static void main(String a[]) {

        SinglyLinkedList sl = new SinglyLinkedList();

        ListNode one = new ListNode(10);
        sl.head = one;
        ListNode two = new ListNode(8);
        ListNode three = new ListNode(1);
        ListNode four = new ListNode(6);
        sl.head.next = two;
        two.next = three;
        three.next = four;
//        sl.printValues();
//       System.out.println("Length of Singly Linked List" + sl.lengthOfSinglyLinkedList());
//       sl.insertNodeAtTheBeginning(18);
//       sl.insertNodeAtTheBeginning(20);
//       sl.insertNodeAtTheBeginning(4);
//       sl.printValues();


//       sl.insertNodeAtTheEnd(18);
//       sl.insertNodeAtTheEnd(20);
//       sl.insertNodeAtTheEnd(4);
//       sl.printValues();

//        sl.insertNodeAtAnyGivenPosition(3,1);
//        sl.insertNodeAtAnyGivenPosition(9,3);
         sl.printValues();
//        sl.deleteFirstNode();
//        sl.deleteLastNode();
//        System.out.println();
//        sl.deleteLastNode();
//        System.out.println();
        sl.deleteNodeAtAnyGivenPosition(1);
        sl.printValues();
    }
}
