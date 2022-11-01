package com.Arrays.sorting;

public class ArrayBubbleSortDescending {

	public static void main(String[] args) {
		int[] numbers = { 12, 34, 10, 7, 5, -6 };
		System.out.print("The Original Array is: ");
		for (int i = 0; i < numbers.length; i++)
			System.out.println(numbers[i]);
		int temp;
//loop for round count
		System.out.println("The Sorted array is: ");
		for (int i = 0; i < numbers.length; i++) {
			int flag = 0;
			// loop for comparison
			for (int j = 0; j < numbers.length - 1 - i; j++) {

				if (numbers[j] < numbers[j + 1]) {
					temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
					flag = 1;
				}
			}

			if (flag == 0) {
				break;
			}
		}
		for (int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");
	}
}
