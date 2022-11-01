package com.Arrays;

public class ArrayFindMissingNumber {

	public static void main(String[] args) {
		int sum = 0;
		int total = 0;
		int[] array = { 1, 2, 3, 5 };
		for (int i = 0; i <= 5; i++) {
			sum = 5 * (5 + 1) / 2;

		}
		System.out.println("The sum is " + sum);
		System.out.println("The numbers are ");
		for (int i = 0; i < array.length; i++) {
			total = total + array[i];

			System.out.println(array[i]);
		}
		System.out.println("The total is: " + total);
		int missingNumber = sum - total;
		System.out.println("The missing number in the array is : " + missingNumber);
	}

}
