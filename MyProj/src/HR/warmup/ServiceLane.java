/*
 * Copyright (c) 2014 ChargeBee Inc
 * All Rights Reserved.
 */
package HR.warmup;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Vaibhav <vaibhav@chargebee.com>
 * https://www.hackerrank.com/challenges/service-lane
 */
public class ServiceLane {
    //length of highway and service lane is N units.
    //constitutes into N segments of unit length with each diff width
    //entry segment = i; exit segment = j; j>i & i>=0
    //pass through all segments b/w i & j (including)
    //1-bike;2-car;3-truck
    //width[N] - width of kth segment
    //atmost 1000 segments
    //if width =1 - bike; =2 bike, car; =3 bike,car,truck

    //N - length of freeway
    //T - num of test case
    //arr[N] - width array
    //T contains i=entry and j=exit
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter N (length of the freeway) & T (number of test cases) : ");

        int n;
        int t;
        n = Integer.parseInt(sc.next());
        if (n < 1 || n > 100000) {
            throw new RuntimeException("1<=N<=100000");
        }
        t = Integer.parseInt(sc.next());
        if (t < 1 || t > 1000) {
            throw new RuntimeException("1<=T<=1000");
        }

        Integer[] widths = new Integer[n];
//        System.out.println("Enter " + n + " widths : ");
        for (int cnt = 0; cnt < n; cnt++) {
            widths[cnt] = Integer.parseInt(sc.next());
        }

        Integer[][] ijs = new Integer[t][2];
//        System.out.println("length : " + ijs.length);
//        System.out.println("Enter " + t + " i & j :");
        for (int cnt = 0; cnt < t; cnt++) {
            ijs[cnt][0] = Integer.parseInt(sc.next());
            ijs[cnt][1] = Integer.parseInt(sc.next());
            validateIj(ijs[cnt][0], ijs[cnt][1], n);
        }
        for (int cnt = 0; cnt < t; cnt++) {
            int i = ijs[cnt][0];
            int j = ijs[cnt][1];
//            System.out.println("i, j:" + i + " " + j);
            int vehicle = 3;
            while (i <= j) {
                if (widths[i] < vehicle) {
                    vehicle = widths[i];
                }
                i++;
            }
//            System.out.println("Vehicle :" + vehicle);
            System.out.println(vehicle);
        }
    }

    private static void validateIj(int i, int j, int n) {
        if (i < 0) {
            throw new RuntimeException("i>0");
        }
        if (j <= i) {
            throw new RuntimeException("i<j");
        }
        if (j >= n) {
            throw new RuntimeException("j<N");
        }
    }
}
