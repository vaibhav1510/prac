/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package Practice.trees;

/**
 *
 * @author vaibhav
 */
public class CeilFloorSortedArr {

    static Node_3 root;

    int Ceil(Node_3 node, int input) {
        return input;
    }

    int Floor(Node_3 node, int input) {
        return input;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};

        int ceil = -1;
        int floor = -1;

        Node_3 base = new Node_3(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            Node_3 base1 = new Node_3(arr[i]);
            base1.left = base;
            base = base1;
        }

        CeilFloorSortedArr tree = new CeilFloorSortedArr();
        tree.root = new Node_3(2);
        tree.root.left = new Node_3(4);
        tree.root.right = new Node_3(6);
        tree.root.left.left = new Node_3(8);
        tree.root.left.right = new Node_3(10);
        tree.root.right.left = new Node_3(12);
        tree.root.right.right = new Node_3(14);

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

class Node_3 {

    int data;
    Node_3 left;
    Node_3 right;

    public Node_3(int data) {
        this.data = data;
    }

}
