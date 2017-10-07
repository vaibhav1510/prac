/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice.trees;

/**
 *
 * @author cb-vaibhav
 */
public class BfsLevelOrderTraversal {

    Node root;

    public BfsLevelOrderTraversal() {
        this.root = null;
    }

    public static void main(String[] args) {

        BfsLevelOrderTraversal tree = new BfsLevelOrderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.printLevelorder();
    }

    private void printLevelorder() {
        for (int i = 1; i <= height(root); i++) {
            printGivenLevel(root, i);
        }
    }

    private void printGivenLevel(Node n, int h) {
        if (n == null) {
            return;
        }
        if (h == 1) {
            System.out.println(n.data);
        } else {
            printGivenLevel(n.left, h - 1);
            printGivenLevel(n.right, h - 1);
        }
    }

    private int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (leftHeight > rightHeight) {
            return leftHeight + 1;
        } else {
            return rightHeight + 1;
        }
    }

    private static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }

    }
}
