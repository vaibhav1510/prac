/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package Practice;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author vaibhav Read more:
 * http://javarevisited.blogspot.com/2012/01/how-to-reverse-string-in-java-using.html#ixzz4DDFzeY00
 */
public class RevereseString {

    public static void main(String args[]) throws FileNotFoundException, IOException {

        String str = "Sony is going to introduce Internet TV soon";
        System.out.println("Original String: " + str);

        String reverseStr = rev(str);
//        String reverseStr = reverseRecursively(str);
        System.out.println("Reverse String in Java using Recursion: " + reverseStr);

    }

    public static String rev(String str) {
        String r = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            r += str.charAt(i);
        }
        return r;
    }

    public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }

}
