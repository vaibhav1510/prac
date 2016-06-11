/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HR.warmup;

import java.util.*;

/**
 *
 * @author vaibhav
 */
public class FlippingBits {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        assert (t > 0 && t <= 100);

        for (int i = 0; i < t; i++) {
            Long a = sc.nextLong();

            String zeros = "00000000000000000000000000000000";
            String bin = Long.toBinaryString(a);
            if (bin.length() < 32) {
                bin = zeros.substring(bin.length()).concat(bin);
            }
            String flipped = "";
            for (int j = 0; j < bin.length(); j++) {
                flipped += Integer.parseInt(bin.substring(j, j + 1)) == 0 ? "1" : "0";
            }
            System.out.println(Long.parseLong(flipped, 2));
        }
    }
}
