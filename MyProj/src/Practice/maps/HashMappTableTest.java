/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package Practice.maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author vaibhav
 */
public class HashMappTableTest {

    public static void main(String args[]) {
        Integer i =null;
        //----------hashtable -------------------------
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(101, " ajay");
        ht.put(101, "Vijay");
        ht.put(102, "Ravi");
        ht.put(103, "Rahul");
//        ht.put(i, "Vishal"); // throws NPE
        System.out.println("-------------Hash table--------------");
        for (Map.Entry m : ht.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //----------------hashmap--------------------------------
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(100, "Amit");
        hm.put(104, "Amit");  // hash map allows duplicate values
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");
        hm.put(i, "Vishal");
        System.out.println("-----------Hash map-----------");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
