/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practo;

import java.util.Scanner;

/**
 *
 * @author vaibhav
 */
public class StringTransformation {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
        String input = "apapap";
        System.out.println(trans(input));
    }

    static String trans(String in) {
        String q = "";
        for (int i = 1; i < in.length(); i++) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (in.charAt(i) == in.charAt(j)) {
                    count++;
                }
            }
            int charVal = Character.getNumericValue(in.charAt(i)) + count;
            if (charVal > 35) {
                charVal = 10 + charVal % 35;
            }
            q = q + String.valueOf((char) charVal);
        }
        return q;
    }
}
