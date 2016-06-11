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
public class MaximizingXor {

    static int maxXor(int l, int r) {
        int max = 0;
        while (l < r) {
            for (int i = l; i < r; i++) {
                String binaryI = Integer.toBinaryString(i);
                String binaryJ = Integer.toBinaryString(i + 1);
                if (binaryI.length() < binaryJ.length()) {
                    binaryI = "0" + binaryI;
                }
                String binaryXOR = "";
                for (int k = 0; k < binaryI.length(); k++) {
                    String iK = binaryI.substring(k, k + 1);
                    String jK = binaryJ.substring(k, k + 1);
                    binaryXOR += iK.equals(jK) ? "0" : "1";
                }
                int xor = Integer.parseInt(binaryXOR, 2);
                max = max > xor ? max : xor;
            }
            l++;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());

        int _r;
        _r = Integer.parseInt(in.nextLine());

        res = maxXor(_l, _r);
        System.out.println(res);

    }
}
