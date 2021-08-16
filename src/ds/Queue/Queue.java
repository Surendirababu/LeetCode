package ds.Queue;

import java.util.List;

public class Queue {

    private ListNode front;
    private ListNode rear;
    private int length;


    private class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private boolean isEmpty() {
        return this.length == 0;
    }

    private void print() {
        ListNode curr = this.front;
        while(curr != this.rear) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.print(curr.data + "->" + "null");
    }

    private void enqueue(int data) {
        ListNode newNode = new ListNode(data);
        if(isEmpty()) {
            this.front = newNode;
            this.rear = newNode;
        } else {
            this.rear.next = newNode;
            this.rear = newNode;
        }
        this.length++;
    }

    private int dequeue() throws IllegalAccessException {
        int val;
        if(isEmpty()) {
            throw new IllegalAccessException("Empty Queue");
        } else {
             val = this.front.data;
             this.front = this.front.next;
        }
        this.length--;
        return val;
    }

    public static void main(String a[]) throws IllegalAccessException {
        Queue q = new Queue();
        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(15);
        q.enqueue(20);

        q.print();

        System.out.println();

        System.out.println("Popped Value : " + q.dequeue());

        System.out.println("Popped Value : " + q.dequeue());

        System.out.println("Popped Value : " + q.dequeue());
    }
}
