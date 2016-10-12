/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package HR.bitmanu;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author vaibhav
 * https://www.hackerrank.com/challenges/counter-game?h_r=next-challenge&h_v=zen
 */
public class CounterGame {

    private static boolean louise = false;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = 1;//s.nextInt();
        for (int i = 0; i < T; i++) {
            long N = 6;//s.nextLong();
            find(N);
            if (louise) {
                System.out.println("Louise");
            } else {
                System.out.println("Richard");
            }
        }
    }

    private static void find(long N) {
        while (N != 1) {
            if ((N & (N - 1)) == 0) {
                N = N - N / 2;
            } else {
                int bitsCount = Long.toBinaryString(N).length();
                String sVal = "1" + new String(new char[bitsCount - 1]).replace("\0", "0");
                Long val = Long.parseLong(sVal, 2);
                N = N - val;
            }
            louise = !louise;
        }
    }
}
