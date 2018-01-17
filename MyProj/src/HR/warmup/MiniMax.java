package HR.warmup;

import java.math.BigInteger;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/mini-max-sum/problem
public class MiniMax {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long[] arr = new long[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = in.nextLong();
		}
		findMinMax(arr);
	}

	public static void findMinMax(long[] arr) {
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			long total = 0l;
			for (int j = 0; j < arr.length; j++) {
				if (i != j) {
					total += arr[j];
				}
			}
			if (min > total) {
				min = total;
			}
			if (max < total) {
				max = total;
			}
		}
		System.out.print(min + " " + max);
	}

}
