/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HR.warmup;

import java.util.Scanner;

/**
 *
 * @author vaibhav
 */
public class GOT1 {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();

        String ans = getAns(inputString);
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        System.out.println(ans);
        myScan.close();
    }

    public static String getAns(String inputString) {
        boolean ans = permutation(inputString);
        return ans ? "YES" : "NO";
    }

    public static boolean permutation(String str) {
        return permutation("", str);
    }

    private static boolean permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            if (isPalindrom(prefix)) {
                return true;
            }
        } else {
            for (int i = 0; i < n; i++) {
                String pp = prefix + str.charAt(i);
                String newStr = str.substring(0, i) + str.substring(i + 1, n);
                return permutation(pp, newStr);
            }
        }
        return false;
    }

    public static boolean isPalindrom(String perm) {
        int mid = (perm.length() % 2 == 0) ? perm.length() / 2 - 1 : perm.length() / 2;
        for (int i = 0; i < mid; i++) {
            char a = perm.charAt(i);
            char b = perm.charAt(perm.length() - i - 1);
            if (a != b) {
                continue;
            }
            return true;
        }
        return false;
    }
}
