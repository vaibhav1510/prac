/*
 * Copyright (c) 2017 ChargeBee Inc
 * All Rights Reserved.
 */
import java.util.Map;
import java.util.HashMap;
import java.util.function.Supplier;

/**
 *
 * @author Vaibhav <vaibhav@chargebee.com>
 */
public class Testt {

    public static void main(String[] args) throws Exception {
        t2();
    }

    static boolean b = true;
    private static final Supplier<Integer> INTERVAL_DAYS = () -> getInt(0);

    public static Integer getInt(int integ) {
        if (b) {
            b = false;
            return integ;
        }
        return 21;
    }

    public static void t2() throws Exception {
        System.out.println(INTERVAL_DAYS.get());
        System.out.println(INTERVAL_DAYS.get());
    }

    public static void t1() throws Exception {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "1");
        map.put("2", "1");
        map.put("3", "0");
        map.put("4", "0");
        map.put("5", "1");

    }
//
//    public static int count(Map<K, V> map, ToIntBiFunction<K,V> func) throws Exception {
//        if (map == null) {
//            return 0;
//        }
//        int total = 0;        
//        for (K k : map.keySet()) {
//            total+=func.applyAsInt(k, map.get(k));
//        }
//        return total;
//    }
}
