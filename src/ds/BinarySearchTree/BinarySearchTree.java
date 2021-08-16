package ds.BinarySearchTree;




//All the Elements to the left side of the
// node should be less than the node value and all the values to the right side of the node should
//greater than the node value
public class BinarySearchTree {

    private TreeNode root;

    private class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    private TreeNode insertValueIntoBst(TreeNode root, int value) {
        if(root ==  null) {
            root = new TreeNode(value);
            return root;
        }

        if(value < root.data) {
           root.left =  insertValueIntoBst(root.left,value);
        }

        if(value > root.data) {
            root.right = insertValueIntoBst(root.right,value);
        }

        return root;
    }

    private TreeNode searchKeyInBst(TreeNode root, int val) {
        if(root == null || root.data == val) {
           return root;
        }
        int data = root.data;
        if(val < data) {
            return searchKeyInBst(root.left, val);
        }
        else {
            return  searchKeyInBst(root.right, val);
        }
    }


    public void recursiveInOrder(TreeNode root) {
        if(root == null){
            return;
        }
        recursiveInOrder(root.left);
        System.out.print(root.data + " "); //4 2 5 1 6 3 7
        recursiveInOrder(root.right);
    }

    public static void main(String a[]) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = bst.insertValueIntoBst(bst.root, 6);
        bst.root = bst.insertValueIntoBst(bst.root, 5);
        bst.root = bst.insertValueIntoBst(bst.root, 7);
        bst.root = bst.insertValueIntoBst(bst.root, 4);
        bst.root = bst.insertValueIntoBst(bst.root, 8);
        bst.root = bst.insertValueIntoBst(bst.root, 3);
        bst.root = bst.insertValueIntoBst(bst.root, 9);

        // Inorder Traversal on a BST will be in Ascending Order
        bst.recursiveInOrder(bst.root); // 3 4 5 6 7 8 9
        TreeNode treeNode = bst.searchKeyInBst(bst.root,5);
        boolean found = false;
        if(treeNode != null) {
            found = true;
        }
        System.out.println("Found Value in BST : " + found );
    }

}
