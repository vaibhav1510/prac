/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HR.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/the-love-letter-mystery
 *
 * @author vaibhav
 */
public class TheLoveLetterMystery {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.println(palindromOps(sc.next().toLowerCase()));
        }
    }

    private static int palindromOps(String input) {
        int count = 0;
        int j = 0;
        int l = input.length() - 1;
        while (j < l) {
            char a = input.charAt(j);
            char b = input.charAt(l);
            count += Math.abs(Character.compare(a, b));
            j++;
            l--;
        }
        return count;
    }
}
