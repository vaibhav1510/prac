package Practice.trees;

public class IsBinaryTreeBST {

    private Node root;

    IsBinaryTreeBST(Node root) {
        this.root = root;
    }

    boolean isBST() {
        return inOrderTraversal(root);
    }

    private int lastVal = Integer.MIN_VALUE;

    private boolean inOrderTraversal(Node n) {
        if (n == null) {
            return true;
        }
        if (!inOrderTraversal(n.left)) {
            return false;
        }
        if (lastVal >= n.data) {
            return false;
        }
//        System.out.println(n.data);
        lastVal = n.data;
        if (!inOrderTraversal(n.right)) {
            return false;
        }
        return true;
    }


    /**
     * 7
     * 3   11
     * 1  5 9  13
     * <p>
     * INFIX =1,3,5,7,9,11,13
     **/
    public static void main(String[] args) {
        Node root = new Node(7);
        root.left = new Node(3);
        root.left.left = new Node(1);
        root.left.right = new Node(5);
        root.right = new Node(11);
        root.right.left = new Node(9);
        root.right.right = new Node(13);

        System.out.println(new IsBinaryTreeBST(root).isBST() ? "Binary Search Tree" : "Not a BST");
    }


    private static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
}
