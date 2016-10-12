/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package Practice.trees;

/**
 *
 * @author vaibhav https://www.hackerrank.com/challenges/30-binary-search-trees
 */
public class BstHeight {

    public static void main(String[] args) {

//        Scanner sc=new Scanner(System.in);
//        int T = sc.nextInt();
//        while (T-- > 0) {
//            int data = sc.nextInt();
//            root = insert(root, data);
//        }
        int T = 7;
//        int[] arr = {3, 5, 2, 4, 6, 7};
        int[] arr = {33, 21, 20, 35, 34, 54};

        Node_Bst_Height root = null;
        for (int i : arr) {
            root = insert(root, i);
        }

        printTree(root);
        
        int height = getHeight(root);
        System.out.println("Height Of The BST: " + height);
    }

    static void printTree(Node_Bst_Height root) {
        if (root == null) {
            return;
        }
        printTree(root.left);
        System.out.println(root.data);
        printTree(root.right);
    }

    static Node_Bst_Height insert(Node_Bst_Height root, int data) {
        if (root == null) {
            return new Node_Bst_Height(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    static int getHeight(Node_Bst_Height root) {
        int leftHt = root.left == null ? -1 : getHeight(root.left);
        int rightHt = root.right == null ? -1 : getHeight(root.right);
        return 1 + Math.max(leftHt, rightHt);
    }
}

class Node_Bst_Height {

    Node_Bst_Height left;
    Node_Bst_Height right;
    int data;

    public Node_Bst_Height(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}
