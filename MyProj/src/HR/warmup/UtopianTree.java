/*
 * Copyright (c) 2014 ChargeBee Inc
 * All Rights Reserved.
 */
package HR.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Vaibhav <vaibhav@chargebee.com>
 * https://www.hackerrank.com/challenges/utopian-tree
 */
public class UtopianTree {
    //2 cycles of groth every year
    // in monsoon - doubled
    // in summer - 1 meter
    //input - int T - num of test case
    // 0<=T<=10
    // 0<=N<=60

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
//        System.out.println("Number of tests T (0<=T<=10) : ");
        int t = Integer.parseInt(br.readLine());

        if (t < 0 || t > 10) {
            throw new RuntimeException("Wrong input.");
        }
        Integer[] cycles = new Integer[t];
        for (int i = 0; i < t; i++) {
//            System.out.println("Number of Cycles N (0<=N<=60) - N[" + (i + 1) + "]");
            int n = Integer.parseInt(br.readLine());
            cycles[i] = n;
            if (n < 0 || n > 60) {
                throw new RuntimeException("Wrong input.");
            }
        }

        for (int i = 0; i < cycles.length; i++) {
            int height = 1;
            for (int j = 1; j <= cycles[i]; j++) {
                if (j % 2 != 0) {
                    height *= 2;
                } else {
                    height += 1;
                }
            }
            System.out.println(height);
//            System.out.println("Length N[" + i + "] : " + height);
        }
        br.close();
    }
}
