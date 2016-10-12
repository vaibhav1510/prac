/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

/**
 *
 * @author vaibhav
 */
public class RotateMatrix {

    public static void main(String[] args) {
//        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        print(matrix);
        System.out.println("RIGHT");
        print(rotate(matrix, 0));
        System.out.println("LEFT");
        print(rotate(matrix, 1));
    }

    private static int[][] rotate(int[][] matrix, int flag) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] result = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int indexM = flag == 1 ? j : n - 1 - j;
                int indexN = flag == 1 ? m - 1 - i : i;
                result[indexM][indexN] = matrix[i][j];
            }
        }
        return result;
    }

    public static void print(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
