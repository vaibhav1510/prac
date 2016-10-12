/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package Practice.trees;

/**
 *
 * @author vaibhav
 */
public class SortedArrToBst {

    static int index = 0;
    static NODE_4 root;

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        root = initChild(arr, 0, arr.length - 1);
        preOrder(root);
    }

    static void preOrder(NODE_4 node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    static NODE_4 initChild(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;

        NODE_4 node = new NODE_4(arr[mid]);

        node.left = initChild(arr, start, mid - 1);
        node.right = initChild(arr, mid + 1, end);
        return node;
    }
}

class NODE_4 {

    int data;

    NODE_4 right;
    NODE_4 left;

    public NODE_4(int data) {
        this.data = data;
    }

}
