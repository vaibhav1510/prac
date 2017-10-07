/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HR.algos;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author cb-vaibhav
 */
public class MiniMax {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int arr_i = 0; arr_i < 5; arr_i++) {
            arr[arr_i] = in.nextInt();            
        }
        findMinMax(arr);
    }

    public static void findMinMax(int[] arr) {
        Integer min = Integer.MIN_VALUE;
        Integer max = Integer.MIN_VALUE;        

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            int total = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    total += arr[j];
                }
            }
            if (min > total) {
                min = total;
            }
            if (max < total) {
                max = total;
            }
        }
        System.out.print(min + " " + max);
    }
}
