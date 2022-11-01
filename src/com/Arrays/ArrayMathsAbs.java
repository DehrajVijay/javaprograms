package com.Arrays;

import com.numbers.Numbers;

public class ArrayMathsAbs {
	static int i;

	public static void main(String[] args) {
		int[] numbers = new int[] { -1, -12, -11, -8, -7 };
		System.out.println("The elements of the array are: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);

		}
		System.out.println("The corresponding +ve array is");
		if (numbers[i] < 0) {
			for (int i = 0; i < numbers.length; i++) {

				numbers[i] = (numbers[i]) * (-1);
				System.out.println(numbers[i]);
			}
		} else {
			System.out.println(numbers[i]);

		}
	}
}