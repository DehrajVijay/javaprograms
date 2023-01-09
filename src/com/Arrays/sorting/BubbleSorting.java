package com.Arrays.sorting;

import java.util.Scanner;

public class BubbleSorting {

	public static void main(String[] args) {
		int temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");

		int size = scan.nextInt();
		int[] numbers = new int[size];
		System.out.println("Enter the elements to sort");
		for (int i = 0; i <= size - 1; i++) {
			numbers[i] = scan.nextInt();

		}
		scan.close();
		for (int i = 0; i < numbers.length; i++) {
			int flag = 0;
			for (int j = 0; j < numbers.length - 1-i; j++) {
				if (numbers[j] > numbers[j + 1]) {
					temp = numbers[j + 1];
					numbers[j + 1] = numbers[j];
					numbers[j] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}
		System.out.println("The sorted array is: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

}
