/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author vaibhav
 */
public class Test2 {

    public static void main(String arg[]) {
        System.out.println("Enter String");
        //Array diclar;
        String argString[] = null;
        Scanner sc = new Scanner(System.in);
        //read the input data
        String inputString = sc.nextLine();

		//inputString=inputString.substring(0,inputString.length()-1);
        if (inputString != null && !inputString.isEmpty()) {
            //split words in array
            argString = inputString.split(" ");
            //Reverse String 
            System.out.println(" Out Value ====  " + ReverseString(argString));
        } else {
            //Intput 
            System.out.println("Input format Invalid");
        }

    }

    //Reverse String Method
    public static String ReverseString(String argString[]) {
        StringBuffer reverse = null;

        String contactString = "";

        try {

            for (int i = 0; i < argString.length; i++) {
                //Apply odd words condition apply;
                if (i % 2 == 0 && argString[i] != null) {

                    reverse = new StringBuffer(argString[i]);
                    //reverse Method Apply
                    contactString += reverse.reverse() + " ";
                } else {
					//String append

                    contactString += argString[i] + " ";
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return contactString;
    }

}
