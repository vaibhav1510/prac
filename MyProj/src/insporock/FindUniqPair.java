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

public class FindUniqPair {

    static class Pair {
        int a;
        int b;
        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
        @Override
        public boolean equals(Object obj) {
            Pair p2 = (Pair) obj;
            return (a == p2.a) || (a == p2.b);
        }
    }

    static int NumberOfPairs(int[] a, long k) {
        List<Pair> l = new ArrayList<Pair>();
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int sum = a[i] + a[j];
                if (sum == k) {
                    Pair p = new Pair(a[i], a[j]);
                    if (!l.contains(p)) {
                        l.add(p);
                    }
                }
            }
        }
        return l.size();
    }

    public static void main(String[] args) throws IOException {
//        int[] a = {1, 3, 46, 1, 3, 9};
        int[] a = {6, 6, 3, 9, 3, 5, 1};
        long k = 12;
        System.out.println(NumberOfPairs(a, k));
    }
}
