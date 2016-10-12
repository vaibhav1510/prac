/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.RegularExpression;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 *
 * @author vaibhav
 */
public class Test {

    public static void main(String[] args) throws Exception {
        test();
//        String s = "vaibhav";
//        String[] list = s.split("\\s", 2);
//        System.out.println(list.length);
//        for (int i = 0; i < list.length; i++) {
//            System.out.println(i+1 + ") " + list[i]);
//        }
//        for (int i = 0; i < 30; i++) {
//            Double rand = Math.random() * 10;
//            int j = rand.intValue() % 4;
//            System.out.println(j);
//        }
    }
    
    private static void test() throws Exception {
        int x = 0;
        int y = 0;
        for (int z = 0; z < 5; z++) {
            if ((++x > 2) && (++y > 2)) {
                x++;
            }
        }
        System.out.println(x + " " + y);
    }

}
