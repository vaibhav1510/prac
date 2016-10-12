/*
 * Copyright (c) 2014 ChargeBee Inc
 * All Rights Reserved.
 */
package Testing;

import java.sql.Timestamp;
import java.util.regex.Pattern;

/**
 *
 * @author Vaibhav <vaibhav@chargebee.com>
 */
public class TestMain1 {
    public static void main(String[] args) {
//        ChildClz c = new ChildClz();
//        c.test();
//        c.meth();
//        
//        Timestamp val = Timestamp.valueOf("2014-10-01 12:09:32");
//        System.out.println(val.getTime());
//        System.out.println(changeEmail("VAIBHVSav@cb.co.in"));
        System.out.println("migration_stte_56456544".split("migration_stte_")[1]);
    }
    
    private static String changeEmail(String email){
        if (email == null || email.isEmpty()) {
            return email;
        }
        return email.toLowerCase().replaceAll("\\@", "_AT_") + "@cb-test.com";
    }
}
