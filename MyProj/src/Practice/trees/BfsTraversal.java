/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package Practice.trees;

import java.io.*;
import java.util.*;

/**
 *
 * @author vaibhav
 */
public class BfsTraversal {

    public static Node_BST_TRAVERSAL insert(Node_BST_TRAVERSAL root, int data) {
        if (root == null) {
            return new Node_BST_TRAVERSAL(data);
        } else {
            Node_BST_TRAVERSAL cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    static void inOrder(Node_BST_TRAVERSAL node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    static void preOrder(Node_BST_TRAVERSAL node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    static void postOrder(Node_BST_TRAVERSAL node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    static void levelOrder(Node_BST_TRAVERSAL root) {
        Queue<Node_BST_TRAVERSAL> q = new LinkedList<Node_BST_TRAVERSAL>();
        q.add(root);
        if (root == null) {
            return;
        }
        while (!q.isEmpty()) {
            Node_BST_TRAVERSAL n = rem(q);
            System.out.print(n.data + " ");
            if (n.left != null) {
                q.add(root.left);
            }
            if (n.right != null) {
                q.add(root.right);
            }
        }
    }
    
    static Node_BST_TRAVERSAL rem(Queue<Node_BST_TRAVERSAL> q){
        Node_BST_TRAVERSAL toRet = q.remove();
        System.out.print("\nQ: ");
        for(Node_BST_TRAVERSAL n:q){
            System.out.print(n.data+" ");
        }
        System.out.println();        
        return toRet;
    }

    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
        Node_BST_TRAVERSAL root = null;
//        while (T-- > 0) {
//            int data = sc.nextInt();
//            root = insert(root, data);
//        }
//        int[] arr = {3, 5, 4, 7, 2, 1};
        int[] arr = {4, 6, 5, 7, 2, 1, 3};
        for (int i : arr) {
            root = insert(root, i);
        }
        System.out.println("IN ORDER =>");
        inOrder(root);
        System.out.println();

        System.out.println("PRE ORDER =>");
        preOrder(root);
        System.out.println();

        System.out.println("POST ORDER =>");
        postOrder(root);
        System.out.println();

        levelOrder(root);
    }
}

class Node_BST_TRAVERSAL {

    Node_BST_TRAVERSAL left;
    Node_BST_TRAVERSAL right;
    int data;

    Node_BST_TRAVERSAL(int data) {
        this.data = data;
        left = right = null;
    }
}
