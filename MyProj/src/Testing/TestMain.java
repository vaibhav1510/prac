/*
 * Copyright (c) 2014 ChargeBee Inc
 * All Rights Reserved.
 */
package Testing;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Vaibhav <vaibhav@chargebee.com>
 */
public class TestMain {

    public static void main(String[] args) {
        System.out.println(TestMain.class.getSimpleName());
//        System.out.println(Character.getNumericValue('Z'));
//        System.out.println(Timestamp.valueOf("2014-05-01 00:00:00"));
//        System.out.println(Timestamp.valueOf("2014-05-01 00:00:00").toString());
//        System.out.println(Timestamp.valueOf("2014-05-01 00:00:00").getNanos());
//        System.out.println(Boolean.parseBoolean("true"));
//        System.out.println(Boolean.parseBoolean("false"));
//        System.out.println(Boolean.parseBoolean("test"));
//        Double d = new Double("1.500001");
//        Integer i = new Integer("11100");
//        Float f = new Float("1.00");
//        
//        BigDecimal bd = new BigDecimal("1.00");
//        Number n = (Number) d;
//        System.out.println(numberToString(n));
    }
    
    public static String numberToString(Number number) {
// Shave off trailing zeros and decimal point, if possible.
        String string = number.toString();
        int indexOfDot = string.indexOf('.');
        if (indexOfDot > 0 && string.indexOf('e') < 0
                && string.indexOf('E') < 0) {
            while (string.endsWith("0")&& string.length() > indexOfDot+2) {
                string = string.substring(0, string.length() - 1);
            }
            if (string.endsWith(".")) {
                string = string.substring(0, string.length() - 1);
            }
        }
        return string;
    }
}
