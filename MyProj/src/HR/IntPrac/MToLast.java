/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package HR.IntPrac;

import java.io.*;
import java.util.*;

/**
 *
 * @author vaibhav
 * https://www.hackerrank.com/contests/programming-interview-questions/challenges/m-th-to-last-element
 */
public class MToLast {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();

        Deque<Integer> list = new LinkedList();
        while (s.hasNextInt()) {
            list.push(s.nextInt());
        }
        s.close();

        if (m > list.size()) {
            System.out.println("NIL");
            System.exit(1);
        }
        int count = 0;
        while (count < m) {
            count++;
            if (count == m) {
                System.out.println(list.pollFirst());
                break;
            } else {
                list.pollFirst();
            }
        }
    }
}
