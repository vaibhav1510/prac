/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package HR.warmup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author vaibhav
 * https://www.hackerrank.com/challenges/staircase?h_r=next-challenge&h_v=zen
 */
public class Pattern {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =6;// in.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j> n-1-i) {
                    System.out.print("#");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
