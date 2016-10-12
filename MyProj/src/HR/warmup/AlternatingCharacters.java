/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HR.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/alternating-characters
 *
 * @author vaibhav
 */
public class AlternatingCharacters {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.println(findMinDeletionCount(sc.next()));
        }
    }

    public static int findMinDeletionCount(String input) {
        String out = "";
        for (int j = 0; j < input.length(); j++) {
            if (j == 0) {
                out += input.substring(j, j + 1);
            } else if (!out.substring(out.length()-1).equals(input.substring(j, j + 1))) {
                out += input.substring(j, j + 1);
            }
        }
        return input.length() - out.length();
    }
}
