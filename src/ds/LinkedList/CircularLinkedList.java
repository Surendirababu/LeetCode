package ds.LinkedList;

import java.util.NoSuchElementException;

public class CircularLinkedList {

    private ListNode last;
    private int length;

    CircularLinkedList() {
        this.last = null;
        this.length = 0;
    }
    static class ListNode {
        private int data;
        private ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    private boolean isEmpty() {
        return length == 0;
    }

    private int length() {
        return length;
    }

    private void createCircularLinkedList() {
        ListNode first = new ListNode(5);
        ListNode second = new ListNode(10);
        ListNode third = new ListNode(15);
        ListNode fourth = new ListNode(20);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        this.last = fourth;
    }

    //First Element -> tail should be null and point new node to tail
    //If it is not the first Element  new node next should point to the previous first node
    // and last.next should point to new node address
    private void insertNodeAtBeginning(int data) {
        ListNode newNode = new ListNode(data);
        if(this.last == null) {
            this.last = newNode;
        } else {
            newNode.next = this.last.next;
        }
        this.last.next = newNode;
        this.length ++;
    }


    //First Element -> tail should be null and point new nod to tail
    // New Node next should point to the first node, last node next should point to new node and then make the new anode as last
    private void insertNodeAtTheEnd(int data) {
        ListNode newNode = new ListNode(data);
        if(this.last == null) {
            this.last = newNode;
            this.last.next = newNode;
        } else {
            newNode.next = this.last.next;
            this.last.next = newNode;
            this.last = newNode;
        }
        this.length++;
    }


    private void removeFirstNodeFromCircularLinkedList() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        if(this.length == 1) {
            return;
        } else {
            ListNode firstNode =  this.last.next;
            this.last.next = firstNode.next;
            firstNode.next = null;
        }
        this.length -- ;
    }


    public static void main(String a[]) {
        CircularLinkedList cll = new CircularLinkedList();
        System.out.println("Created object");
        cll.createCircularLinkedList();
        System.out.println("Created cll");
        cll.printElements();
        System.out.println("Before Inserting element at the beginning");
        cll.insertNodeAtBeginning(30);
        System.out.println("Printing Elements after inserting new node at the beginning");
        cll.printElements();
        System.out.println("Before Inserting element at the end");
        cll.insertNodeAtTheEnd(35);
        System.out.println("Printing Elements after inserting new node at the end");
        cll.printElements();
        System.out.println("Before Removing first element at the Beginning");
        cll.removeFirstNodeFromCircularLinkedList();
        System.out.println("Printing Elements after removing node from the Cll");
        cll.printElements();
    }


    // Want to know the First - tail.next
    // Traverse when first not equals to last - print data
    private void printElements() {
        if(last == null) {
            return;
        }
        ListNode first = this.last.next;
        while(first != this.last) {
            System.out.print(first.data + "->");
            first = first.next;
        }
        System.out.print(first.data);
        System.out.println();
    }

}
