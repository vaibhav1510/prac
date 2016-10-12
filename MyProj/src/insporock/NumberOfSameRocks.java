/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package insporock;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NumberOfSameRocks {

    static int gemstones(String[] rocks) {
        int numOfRocks = rocks.length;

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < rocks.length; i++) {
            String r = rocks[i];
            List<Integer> uniq = new ArrayList< Integer>();
            for (int j = 0; j < r.length(); j++) {

                int c = r.charAt(j);
                if (uniq.contains(c)) {
                    continue;
                }
                if (map.containsKey(c)) {
                    Integer count = map.get(c);
                    map.put(c, count + 1);
                } else {
                    map.put(c, 1);
                }
                uniq.add(c);
            }
        }

        int count = 0;
        for (Integer cc : map.keySet()) {
            if (map.get(cc) == numOfRocks) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        String[] i = {"abcdde", "baccd", "eeabg"};
        System.out.println(gemstones(i));
    }
}
