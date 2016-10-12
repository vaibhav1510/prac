/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package Practice.bits;

import java.util.Scanner;

/**
 *
 * @author vaibhav
 */
class Power {

    int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }
        if (n == 2) {
            return 1 << p;
        } else {

        }
        return (int) Math.pow(n, p);
    }
}

class Solution {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int n = in.nextInt();
            int p = in.nextInt();
            Power myCalculator = new Power();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
