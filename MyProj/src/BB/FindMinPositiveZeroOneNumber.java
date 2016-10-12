/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BB;

import java.util.Scanner;

/**
 *
 * @author vaibhav
 */
public class FindMinPositiveZeroOneNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        System.out.println(findInt(N));
    }

    static long findInt(Long n) {
        long val = findVal(n);
        System.out.println(val);
        while (true) {
            if (val % n == 0) {
                return val;
            }
            val *= 10;
        }
    }

    static long findVal(long n) {
        System.out.println(n);
        Long v = n;
        while (true) {
            if (v % 10 != 0) {
                v += 1;
                continue;
            }
            String s = v.toString();
            boolean passed = true;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch != '1' && ch != '0') {
                    passed = false;
                }
            }
            System.out.println(v);
            if (passed) {
                return v;
            }
            v += 10;
        }
    }

}
