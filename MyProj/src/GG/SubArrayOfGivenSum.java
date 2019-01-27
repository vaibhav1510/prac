/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GG;

/**
 *
 * @author cb-vaibhav
 */
public class SubArrayOfGivenSum {
	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Integer sum = 15;

		// Integer[] arr = { 1, 4, 20, 3, 10, 5 };
		// Integer sum = 33;

		// Integer[] arr = {1, 4, 0, 0, 3, 10, 5};
		// Integer sum = 7;

		// Integer[] arr = {1, 4};
		// Integer sum = 0;
		findSubArray(arr, sum);
	}

	private static void findSubArray(Integer[] arr, Integer sum) {
		int currSum = arr[0];
		int start = 0;
		for (int i = 1; i < arr.length; i++) {
			while (currSum > sum && start < i - 1) {
				currSum = currSum - arr[start];
				start++;
			}
			if (currSum == sum) {
				System.out.println("START:" + start + ",END:" + (i - 1));
				break;
			}
			currSum += arr[i];
		}
	}
}
