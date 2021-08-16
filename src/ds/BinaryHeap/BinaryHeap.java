package ds.BinaryHeap;

public class BinaryHeap {

    private Integer[] heap;
    private int n;

    private BinaryHeap(int capacity) {
        heap = new Integer[capacity + 1];
        n = 0;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public static void main(String a[]) {
        BinaryHeap bh = new BinaryHeap(4);
        bh.insertElement(4);
        bh.insertElement(5);
        bh.insertElement(2);
        bh.insertElement(6);
        bh.insertElement(1);
        bh.insertElement(3);
        bh.printElements();
    }

    private void printElements() {
        for(int i = 1; i <= n ; i++) {
            System.out.print(heap[i] + " ");
        }
    }

    //Max Binary Heap - parent node should always have values higher than all of its children
    private void insertElement(int x) {
        if(n == heap.length -1) {
            resize(2 * heap.length);
        }
        n++;
        heap[n] = x;
        swim(n);
    }

    //Re-Heapify will compare the value of the new node with the parent node, and make adjucements
    private void swim(int k) {
        while (k > 1 && heap[k/2] < heap[k]){
            int temp = heap[k];
            heap[k] = heap[k/2];
            heap[k/2] = temp;
            k = k/2;
        }
    }


    private void resize(int newCapacity) {
        Integer[] temp = new Integer[newCapacity];
        for(int i = 0; i < heap.length; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }



}



