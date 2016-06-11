/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package insporock;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MergeTwoSortedArrays {

    static int[] mergeArrays(int[] a, int[] b) {
        Stack<Integer> stack = new Stack<Integer>();

        int m = a.length;
        for (int i = 0; i < m; i++) {
            stack.add(a[i]);
        }

        for (int i = 0; i < m; i++) {
            addToStack(i, stack);
        }

        int[] result = new int[2 * m];

        for (int i = 2 * m - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }

    static void addToStack(int i, Stack<Integer> s) {
        List<Integer> l = new ArrayList<Integer>();
        Integer top = s.pop();
        l.add(top);
        while (top > i && !s.isEmpty()) {
            top = s.pop();
            if (top > i) {
                l.add(top);
            } else {
                s.add(top);
            }

        }
        s.push(i);
        Collections.sort(l);
        s.addAll(l);
    }

    public static void main(String[] args) throws IOException {
        int[] a = {1, 5, 7, 7};
        int[] b = {0, 1, 2, 3};
        int[] res = mergeArrays(a, b);
        for (int i = 0; i < 8; i++) {
            System.out.print(res[i] + " ");
        }

//        Scanner in = new Scanner(System.in);
//        final String fileName = System.getenv("OUTPUT_PATH");
//        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
//        int[] res;
//
//        int _a_size = 0;
//        _a_size = Integer.parseInt(in.nextLine());
//        int[] _a = new int[_a_size];
//        int _a_item;
//        for (int _a_i = 0; _a_i < _a_size; _a_i++) {
//            _a_item = Integer.parseInt(in.nextLine());
//            _a[_a_i] = _a_item;
//        }
//
//        int _b_size = 0;
//        _b_size = Integer.parseInt(in.nextLine());
//        int[] _b = new int[_b_size];
//        int _b_item;
//        for (int _b_i = 0; _b_i < _b_size; _b_i++) {
//            _b_item = Integer.parseInt(in.nextLine());
//            _b[_b_i] = _b_item;
//        }
//
//        res = mergeArrays(_a, _b);
//        for (int res_i = 0; res_i < res.length; res_i++) {
//            bw.write(String.valueOf(res[res_i]));
//            bw.newLine();
//        }
//
//        bw.close();
    }
}
