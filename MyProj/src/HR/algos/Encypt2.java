/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package HR.algos;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author vaibhav https://www.hackerrank.com/challenges/caesar-cipher-1
 */
public class Encypt2 {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        String s = in.next();
//        int k = in.nextInt();

        test(11, "middle-Outz", 2); // okffng-Qwvb
        test(10, "159357lcfd", 98); // 159357fwzx
        test(4, "lcdf", 98); // fwzx

    }

    private static void test(int n, String s, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        StringBuffer buff = new StringBuffer();
        for (int i = 0; i < n; i++) {
            int curr = s.charAt(i);
            if (map.containsKey(curr)) {
                buff.append((char) map.get(curr).intValue());
                continue;
            }
            int nwInt = newVal(curr, k);
            char newVal = (char) nwInt;
            map.put(curr, nwInt);
            buff.append(newVal);
        }
        System.out.println(buff.toString());
    }

    private static int newVal(int curr, int k) {
        int newVal;
        if (curr >= 65 && curr <= 90) {
            int v = curr + k;
            if (v > 90) {
                int e = ((v - 90) % 26);
                v = (e == 0) ? 90 : (65 + e - 1);
            }
            newVal = v;
        } else if (curr >= 97 && curr <= 122) {
            int v = curr + k;
            if (v > 122) {
                int e = ((v - 122) % 26);
                v = (e == 0) ? 122 : (97 + e - 1);
            }
            newVal = v;
        } else {
            newVal = curr;
        }
        return newVal;
    }
}
