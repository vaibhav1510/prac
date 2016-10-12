/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package HR.arrays;

import java.io.*;
import java.util.*;

/**
 *
 * @author vaibhav
 * https://www.hackerrank.com/challenges/sparse-arrays?h_r=next-challenge&h_v=zen
 */
public class SparceArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        String[] narr = new String[n];
        for (int i = 0; i < n; i++) {
            narr[i] = s.nextLine();
        }

        int q = s.nextInt();
        for (int i = 0; i < q; i++) {
            String qq = s.nextLine();
            System.out.println(find(narr, qq));
        }

    }

    public static int find(String[] narr, String s) {
        int count = 0;
        for (int i = 0; i < narr.length; i++) {
            if (narr[i].equals(s)) {
                count++;
            }
        }
        return count;
    }
}
