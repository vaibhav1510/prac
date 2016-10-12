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
 * @author vaibhav https://www.hackerrank.com/challenges/dynamic-array
 */
public class DynamicArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int q = s.nextInt();

        ArrayList<Long>[] seqList = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            seqList[i] = new ArrayList<Long>();
        }
        int lastAns = 0;

        long[][] inp = new long[q][3];

        for (int i = 0; i < q; i++) {
            for (int j = 0; j < 3; j++) {
                inp[i][j] = s.nextLong();
            }
            long qr = inp[i][0];
            long x = inp[i][1];
            long y = (int) inp[i][2];
            long idx = (x ^ lastAns) % n;
            if (qr == 1) {
//                seqList[idx].add(y);
            } else {
//                lastAns = seqList[idx].get(y);
                System.out.println(lastAns);
            }
        }

        s.close();
    }
}
