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
public class Encypt {

    static HashMap<Integer, Character> map = new HashMap<Integer, Character>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//11
        String s = in.next();//"middle-Outz"
        int k = in.nextInt();//2

        for (int i = 0; i < n; i++) {
            int curr = s.charAt(i);
            char newVal = newVal(curr, k);
            if (i == 0) {
                s = newVal + s.substring(1);
            } else if (i == n - 1) {
                s = s.substring(0, n - 1) + newVal;
            } else {
                s = s.substring(0, i) + newVal + s.substring(i + 1, n);
            }
//            System.out.println(curr + "=" + newVal + "=>" + s);
        }
        System.out.println(s);
    }

    private static char newVal(int curr, int k) {
        if (map.containsKey(curr)) {
            return map.get(curr);
        }
        char newVal;
        if (curr >= 65 && curr <= 90) {
            int v = curr + k;
            newVal = (char) (v > 90 ? v + 65 - 90 - 1 : v);
        } else if (curr >= 97 && curr <= 122) {
            int v = curr + k;
            newVal = (char) (v > 122 ? v + 97 - 122 - 1 : v);
        } else {
            newVal = (char) curr;
        }
        map.put(curr, newVal);
        return newVal;
    }
}
