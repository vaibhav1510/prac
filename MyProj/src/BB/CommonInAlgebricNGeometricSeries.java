/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BB;

/**
 *
 * @author vaibhav
 */
public class CommonInAlgebricNGeometricSeries {

    public static void main(String[] args) {
        System.out.println(countSeriesTerms(1, 1, 1, 2, 4));
    }
    static int count = 0;

    static int countSeriesTerms(int A, int D, int B, int R, int Lim) {
        int val1 = A, val2 = B;
        Node root = new Node(A);
        insert(root, B);
        while (val1 <= Lim && val2 <= Lim) {
            val1 += D;
            val2 *= R;
            if (val1 <= Lim) {
                insert(root, val1);
            }
            if (val2 <= Lim) {
                insert(root, val2);
            }
        }
        return count;
    }

    static class Node {

        Node left;

        Node right;

        int value;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void insert(Node node, int value) {
        if (value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                node.left = new Node(value);
            }
        } else if (value > node.value) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                node.right = new Node(value);
            }
        } else {
            count++;
        }
    }

}
