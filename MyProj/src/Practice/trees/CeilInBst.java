/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package Practice.trees;

/**
 *
 * @author vaibhav
 */
// Binary Tree
public class CeilInBst {

    static Node_1 root;

    // Function to find ceil of a given input in BST. If input is more
    // than the max key in BST, return -1
    //Ceil Value Node: Node with smallest data larger than or equal to key value.
    int Ceil(Node_1 node, int input) {

        // Base case
        if (node == null) {
            return -1;
        }

        // We found equal key
        if (node.data == input) {
            return node.data;
        }

        // If root's key is smaller, ceil must be in right subtree
        if (node.data < input) {
            return Ceil(node.right, input);
        }

        // Else, either left subtree or root has the ceil value
        int ceil = Ceil(node.left, input);
        return (ceil >= input) ? ceil : node.data;
    }

    // Driver program to test the above functions
    public static void main(String[] args) {
        CeilInBst tree = new CeilInBst();
        tree.root = new Node_1(8);
        tree.root.left = new Node_1(4);
        tree.root.right = new Node_1(12);
        tree.root.left.left = new Node_1(2);
        tree.root.left.right = new Node_1(6);
        tree.root.right.left = new Node_1(10);
        tree.root.right.right = new Node_1(14);

        /**
         * =========8==============//
         * =====4==========12======//
         * =2=====6===10=======14==//
         */
        for (int i = 0; i < 16; i++) {
            System.out.println(i + " " + tree.Ceil(root, i));
        }
    }

}

class Node_1 {

    int data;
    Node_1 left;
    Node_1 right;

    public Node_1(int data) {
        this.data = data;
    }

}
