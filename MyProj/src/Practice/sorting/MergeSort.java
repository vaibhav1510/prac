/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package Practice.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author vaibhav
 */
public class MergeSort {

    static List<Integer> res = new ArrayList<Integer>();

    public static void main(String[] args) {
        int[] arr = {2, 19, 4, 10, 43, 54, 12, 76, 27};

        int mid = arr.length / 2;

        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        sort(left, right);
    }

    private static void sort(int[] left, int[] right) {
        if (left.length > 0 && right.length > 0) {
            if (left[0] < right[0]) {
                res.add(left[0]);
            } else {
                res.add(right[0]);
            }
        }
    }

}
