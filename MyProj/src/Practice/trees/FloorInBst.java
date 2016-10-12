/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package Practice.trees;

/**
 *
 * @author vaibhav
 */
public class FloorInBst {

    static Node_2 root;

    //Floor Value Node: Node with largest data smaller than or equal to key value.
    static int Floor(Node_2 node, int input) {
        if (node == null) {
            return -1;
        }
        if (input == node.data) {
            return node.data;
        }
        if (node.data > input) {
            return Floor(node.left, input);
        }
        int floor = Floor(node.right, input);
        return (node.data >= floor) ? node.data : floor;
    }

    // Driver program to test the above functions
    public static void main(String[] args) {
        FloorInBst tree = new FloorInBst();
        tree.root = new Node_2(8);
        tree.root.left = new Node_2(4);
        tree.root.right = new Node_2(12);
        tree.root.left.left = new Node_2(2);
        tree.root.left.right = new Node_2(6);
        tree.root.right.left = new Node_2(10);
        tree.root.right.right = new Node_2(14);

        /**
         * =========8==============// 
         * =====4==========12======//
         * =2=====6===10=======14==//
         */
        for (int input = 0; input < 18; input++) {
            System.out.println(input + " " + tree.Floor(root, input));
        }
    }
}

class Node_2 {

    int data;
    Node_2 left;
    Node_2 right;

    public Node_2(int data) {
        this.data = data;
    }

}
