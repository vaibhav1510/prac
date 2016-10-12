/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package HR.strings;

import java.io.*;
import java.util.*;

/**
 *
 * @author vaibhav
 * https://www.hackerrank.com/challenges/30-review-loop?h_r=next-challenge&h_v=zen
 */
public class StringConcat {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int k = 0; k < n; k++) {
            print(s.next());
        }
        s.close();
    }

    public static void print(String in) {
        String odd = "";
        for (int i = 0; i < in.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(in.charAt(i));
            } else {
                odd = odd + in.charAt(i);
            }
        }
        System.out.print(" " + odd);
    }
}
