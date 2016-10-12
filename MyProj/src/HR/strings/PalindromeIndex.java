/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HR.strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author vaibhav
 */
// https://www.hackerrank.com/challenges/palindrome-index
public class PalindromeIndex {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String str = sc.next();
            System.out.println(checkPalindrome(str));
        }
    }

    public static int checkPalindrome(String str) {
        if (isPalindrome(str)) {
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            String s = "";
            if (i == 0) {
                s = str.substring(1);
            } else if (i == str.length() - 1) {
                s = str.substring(0, i);
            } else {
                s = str.substring(0, i) + str.substring(i + 1);
            }
            if (isPalindrome(s)) {
                return i;
            }
        }
        throw new RuntimeException();
    }

    public static boolean isPalindrome(String str) {
        for (int j = 0; j < (str.length() / 2); j++) {
            if (str.charAt(j) == str.charAt(str.length() - 1 - j)) {
                continue;
            }
            return false;
        }
        return true;
    }
}
