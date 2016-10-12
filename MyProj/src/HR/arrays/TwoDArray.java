/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package HR.arrays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author vaibhav
 * https://www.hackerrank.com/challenges/2d-array?h_r=next-challenge&h_v=zen
 */
public class TwoDArray {

    public static void main(String[] args) {

        int arr[][] = {
            {1, 1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 9, 2, -4, -4, 0},
            {0, 0, 0, -2, 0, 0},
            {0, 0, -1, -2, -4, 0}
        };
        solve(arr);
    }

    private static void solve(int[][] arr) {
        int max = -55;
        for (int i = 0; i < 4; i++) {
            int vCount = 0;
            while (vCount <= 3) {
                int val = 0;
                for (int j = vCount; j < vCount + 3; j++) {
                    val = sum(arr, val, i, j);
                }
                val = sum(arr, val, i + 1, vCount + 1);

                val = sum(arr, val, i + 2, vCount);
                val = sum(arr, val, i + 2, vCount + 1);
                val = sum(arr, val, i + 2, vCount + 2);
                if (val > max) {
                    max = val;
                }
                vCount++;
                System.out.println();
            }

        }
        System.out.print(max);
    }

    private static int sum(int[][] arr, int val, int i, int j) {
        System.out.print("(" + i + "," + j + ") ");
        return val + arr[i][j];
    }
}
