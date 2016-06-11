/*
 * Copyright (c) 2015 ChargeBee Inc
 * All Rights Reserved.
 */
package sample;

import java.sql.Timestamp;
import java.util.*;

/**
 *
 * @author vaibhav
 */
public class TestComapre {

    public static void main(String[] args) throws Exception {
        List<Payment> l = new ArrayList<Payment>();

        l.add(new Payment(1446468954l)); // 2015-11-02 18:25:54.0
        l.add(new Payment(1426468954l)); // 2015-03-16 06:52:34.0

        Comparator<Payment> comp = new Comparator<Payment>() {

            public int compare(Payment p1, Payment p2) {
                return p1.date.compareTo(p2.date);
            }
        };

        System.out.println(max(l, comp).date);
    }

    private static class Payment {

        private Timestamp date;

        public Payment(Long date) {
            this.date = new Timestamp(date * 1000);
        }
    }

    public static <E> E max(Collection<E> list, Comparator<E> comparator) {
        if (list == null) {
            return null;
        }
        E max = null;
        for (E e : list) {
            if (max == null) { // first time
                max = e;
            } else if (comparator.compare(max, e) < 0) {
                max = e;
            }
        }
        return max;
    }
}
