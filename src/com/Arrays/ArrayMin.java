package com.Arrays;

public class ArrayMin {
	// creating a method which receives an array as a parameter
	
	static void min(int numbers[]) {
		int min = numbers[0];
		for (int i = 1; i < numbers.length; i++)
			if (min > numbers[i])
				min = numbers[i];
		System.out.println(min);
	}

	public static void main(String[] args) {
		// declaring and initializing an array
		int a[] = { 12, 32, -9, 0, 14 };
		System.out.println("The Minimum Value in the array is : ");
		// passing array to method
		min(a);
	}

}
