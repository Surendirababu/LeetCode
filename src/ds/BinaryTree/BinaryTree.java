package ds.BinaryTree;


import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

    private TreeNode root;

    private class TreeNode {

        private int data;
        private TreeNode left;
        private TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    private void createBinaryTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);


        //Assign first to root
        root = first;

        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;

    }

    /*
    * Pre-Order
    * 1.Visit the node
    * 2.Traverse the left side of the tree
    * 3.Traverse the right side of the data;
    *
    * */
    private void recursivePreOrder(TreeNode root) {
        if(root == null){
            return;
        }
        System.out.print(root.data + " "); //1 2 4 5 3 6 7
        recursivePreOrder(root.left);
        recursivePreOrder(root.right);
    }

    private void iterativePreOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if(temp.right != null) {
                stack.push(temp.right);
            }
            if(temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    /*
     * In-Order
     * 1.Traverse the left side of the tree
     * 2.Visit the node
     * 3.Traverse the right side of the data;
     *
     * */
    public void recursiveInOrder(TreeNode root) {
        if(root == null){
            return;
        }
        recursiveInOrder(root.left);
        System.out.print(root.data + " "); //4 2 5 1 6 3 7
        recursiveInOrder(root.right);
    }

    private void iterativeInOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(!stack.isEmpty() || temp != null) {
            // It will traverse all through the left side of the tree
            if(temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    /*
     * Post-Order
     * 1.Traverse the left side of the tree
     * 2.Traverse the right side of the data
     * 3.Visit the node
     *
    */
    private void recursivePostOrder(TreeNode root) {
        if(root == null){
            return;
        }
        recursivePostOrder(root.left);
        recursivePostOrder(root.right);
        System.out.print(root.data + " "); // 4 5 2 6 7 3 1
    }

    private void iterativePostOrder(TreeNode root) {
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        while(current!= null || !stack .isEmpty()) {
            if(current != null) {
                stack.push(current);
                current = current.left;
            } else {
                TreeNode temp = stack.peek().right;
                if(temp == null) {
                    temp = stack.pop();
                    System.out.print(temp.data + " ");
                    while(!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        System.out.print(temp.data + " ");
                    }
                } else {
                    current = temp;  // 4 5 2 6 7 3 1
                }
            }
        }
    }


    //Level Order Traversal of a a Binary Tree - Queue DS
    private void levelOrderTraversal(TreeNode root) {
        if(root == null ) {
            throw new NoSuchElementException("Tree Node cannot be null");
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");

            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }

    }

    //Find Maximum Value in Binary Tree
    private int findMaxValueInBinaryTree(TreeNode root) {
        if (root == null) {
           return Integer.MIN_VALUE;
        }
        int result = root.data;
        int left = findMaxValueInBinaryTree(root.left);
        int right = findMaxValueInBinaryTree(root.right);
        if(left > result) {
            result = left;
        }
        if(right > result) {
            result = right;
        }
        return result;
    }


    public static void main(String a[]) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();

//        System.out.println("Pre - Order Traversal - Recursive");
//        bt.recursivePreOrder(bt.root);
//        System.out.println();
//
//        System.out.println("Pre - Order Traversal - Iterative");
//        bt.iterativePreOrder(bt.root);
//        System.out.println();

//        System.out.println("In - Order Traversal - Recursive");
//        bt.recursiveInOrder(bt.root);
//        System.out.println();
//
//        System.out.println("In - Order Traversal - Iterative");
//        bt.iterativeInOrder(bt.root);
//        System.out.println();


//        System.out.println("Post - Order Traversal - Recursive");
//        bt.recursivePostOrder(bt.root);
//        System.out.println();
//
//        System.out.println("Post - Order Traversal - Iterative");
//        bt.iterativePostOrder(bt.root);
//        System.out.println();
//
//        System.out.println("Level - Order Traversal");
//        bt.levelOrderTraversal(bt.root); //1 2 3 4 5 6 7
//        System.out.println();

          System.out.println("Maximum Value in Binary Tree");
          int maxiMumValue = bt.findMaxValueInBinaryTree(bt.root); //8
          System.out.println("maxiMumValue : " + maxiMumValue);

    }
}
