/*
 * Copyright (c) 2014 ChargeBee Inc
 * All Rights Reserved.
 */
package Testing2;

/**
 *
 * @author Vaibhav <vaibhav@chargebee.com>
 */
public class TestMain {

    public static void main(String[] args) {
        String s = "cus_6cP4N5TKuyVL5A|card_16PAGEApqRMNvlpeAgEi5Ney";
        String[] arr = s.split("\\|");
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }

    public static void main1(String[] args) {
        int N = 2;
        System.out.println(solution(N));
    }

    public static int solution(int N) {
        if (N == 0) {
            return 1;
        }
        int oneSide = 0;
        int p = N + 1;
        while (p > 0) {
            oneSide += p;
            p--;
        }

        int total = oneSide * 4 - ((N + 1) * 3) - N;
        return total > 1000000000 ? -1 : total;
    }
}
