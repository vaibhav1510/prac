/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package selftest.maps;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author vaibhav
 */
public class MapTest {

    static Map<Map, String> m1 = new HashMap();

    public static void main(String[] args) {
        Map<String, String> m2 = new HashMap();
        m2.put("key", "val");
        
        Map<String, String> m3 = new HashMap();
        m2.put("key", "val");
        
        

        m1.put(m2, "val2");
        m1.put(m3, "val2");

        for (Map mm : m1.keySet()) {
            System.out.println(m1.get(mm));
            for (Object key : mm.keySet()) {
                System.out.println(key);
                System.out.println(mm.get(key));
            }
        }

    }
}
