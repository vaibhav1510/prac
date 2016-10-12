/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package Practice.binary_search;

import java.util.Scanner;

/**
 *
 * @author vaibhav
 */
public class BSearch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int key = s.nextInt();

        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
                System.out.println("Found at index: " + mid);
                System.exit(3);
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println("Not Found");
    }
}
