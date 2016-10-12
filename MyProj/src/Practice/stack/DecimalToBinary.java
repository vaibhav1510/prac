/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package Practice.stack;

import java.util.Stack;

/**
 *
 * @author vaibhav
 */
public class DecimalToBinary {

    public static void main(String[] args) {
        int i = 10;

        Stack<Integer> stk = new Stack<Integer>();

        while (i > 1) {
            stk.push(i % 2);
            i = i / 2;
        }
        stk.push(i);
        String s = "";
        while (!stk.isEmpty()) {
            s += stk.pop();
        }
        System.out.println(s);
    }

}
