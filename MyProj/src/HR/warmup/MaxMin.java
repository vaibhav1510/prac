/*
 * Copyright (c) 2014 ChargeBee Inc
 * All Rights Reserved.
 */
package HR.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Vaibhav <vaibhav@chargebee.com>
 * https://www.hackerrank.com/challenges/angry-children
 */
// The part of the program involving reading from STDIN and writing to STDOUT has been provided by us.
public class MaxMin {

    static BufferedReader in = new BufferedReader(new InputStreamReader(
            System.in));
    static StringBuilder out = new StringBuilder();

    public static void main(String[] args) throws NumberFormatException, IOException {
        int numPackets = Integer.parseInt(in.readLine());
        int numKids = Integer.parseInt(in.readLine());
        int[] packets = new int[numPackets];

        for (int i = 0; i < numPackets; i++) {
            packets[i] = Integer.parseInt(in.readLine());
        }
        int unfairness = Integer.MAX_VALUE;

        // Write your code here, to process numPackets N, numKids K, and the packets of candies
        // Compute the ideal value for unfairness over here
        Arrays.sort(packets);
        unfairness = packets[numKids - 1] - packets[0];
        for (int i = 1; i < numPackets - numKids + 1; i++) {
            if (unfairness > (packets[numKids + i - 1] - packets[i])) {
                unfairness = packets[numKids + i - 1] - packets[i];
            }
        }
        System.out.println(unfairness);
    }
    
}
