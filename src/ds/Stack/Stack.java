package ds.Stack;


public class Stack<Character> {

    private ListNode<Character> top;
    private int length;

    class ListNode<Character> {
        private Character data;
        private ListNode<Character> next;

        ListNode(Character data) {
            this.data = data;
            this.next = null;
        }
    }

    private int length() {
        return this.length;
    }

    private boolean isEmpty() {
        return this.length == 0;
    }

    private void push(Character data) {
        ListNode<Character> newNode = new ListNode(data);
        if(isEmpty()){
           this.top = newNode;
        } else {
            ListNode temp = this.top;
            this.top = newNode;
            this.top.next = temp;
        }
        this.length++;
    }

    private Character pop() {
        if(isEmpty()) {
            this.top = null;
        } else {
            Character data = this.top.data;
            this.top = this.top.next;
            return data;
        }
        this.length--;
        return null;
    }

    public static void main(String args[]) {
        String name = "SAITHEJAS";
        char[] charArray = name.toCharArray();
        Stack stackChar = new Stack<>();
        for(int i = 0; i < charArray.length; i++) {
            stackChar.push(charArray[i]);
        }

        for(int i = 0; i < charArray.length; i++) {
            System.out.print(stackChar.pop() + " ");
        }

    }
}
