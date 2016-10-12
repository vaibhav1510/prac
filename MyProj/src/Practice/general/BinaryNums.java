/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package Practice.general;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author vaibhav https://www.hackerrank.com/challenges/30-binary-numbers
 */
public class BinaryNums {

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 951; // in.nextInt();
        
        int res=0;
        int count=0;
        String s = Integer.toBinaryString(n);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                count++;
            } else {
                if(res<count){
                    res=count;                    
                }
                count=0;
            }            
        }
        res = res<count?count:res;
        System.out.println(res);
    }
     
    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = Integer.toBinaryString(n);
        Integer ii = Integer.parseInt(s);

        int maxCount = 0;
        int count = 0;

        while (ii > 1) {
            if (ii % 10 == 0) {
                count = 0;
            } else {
                count = count + 1;
            }
            if (maxCount < count) {
                maxCount = count;
            }
            ii = ii / 10;
//            System.out.println("=>" + ii);
        }
        maxCount = (ii == 1 && count > 0) ? maxCount + 1 : maxCount;
        System.out.println(maxCount);
    }

}
