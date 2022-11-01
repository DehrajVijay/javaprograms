package com.Arrays;

import java.util.*;

public class ArrayLastElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int size = sc.nextInt();
		int i, j;

		int[] numbers = new int[size];
		System.out.println("Enter the Elements of array");
		for (i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
			System.out.println(numbers[i]);
		}
		System.out.println();
		System.out.println("The Last element of the array is : ");
		System.out.println(numbers[numbers.length - 1]);

	}

}
