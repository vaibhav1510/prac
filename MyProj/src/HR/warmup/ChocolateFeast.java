/*
 * Copyright (c) 2014 ChargeBee Inc
 * All Rights Reserved.
 */
package HR.warmup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author Vaibhav <vaibhav@chargebee.com>
 * https://www.hackerrank.com/contests/oct13/challenges/chocolate-feast
 */
public class ChocolateFeast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }

    private static long Solve(int n, int a, int b) {
        //Write code to solve each of the test over here
        int numOfChocolates = n / a;
        int total = numOfChocolates;
        while (numOfChocolates >= b) {
            int extra = numOfChocolates / b;
            total += extra;

            int remining = numOfChocolates % b;
            numOfChocolates = extra + remining;
        }
        return total;
    }
}
