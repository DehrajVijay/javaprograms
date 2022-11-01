package com.Arrays;

public class ArrayDemo3 {
	// creating method which returns an array
	static int[] get() {
		return new int[] { 12, 10, 22, -34, 10 };
	}

	public static void main(String[] args) {

		// calling method which will return an array

		int numbers[] = get();

		// printing the values of array
		for (int i = 0; i < numbers.length; i++)
			System.out.println(numbers[i]);

		System.out.println("Same output by using for-each loop\n========================");
		for (int i : numbers)
			System.out.println(i);
	}

}
