/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package Practice.generics;

/**
 *
 * @author vaibhav
 * https://www.hackerrank.com/challenges/30-generics?h_r=next-challenge&h_v=zen
 */
public class ForLoop {

    public static <T> void printArray(T... arr) {
        for (T t : arr) {
            System.out.println(t);
        }
    }

    public static void main(String args[]) {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};

        printArray(intArray);
        printArray(stringArray);

        if (ForLoop.class.getDeclaredMethods().length > 2) {
            System.out.println("You should only have 1 method named printArray.");
        }
    }
}
