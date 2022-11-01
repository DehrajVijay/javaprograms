package com.Arrays;

public class ArraysDemo1 {

	public static void main(String[] args) {
		int numbers[] = new int[5];
		numbers[0] = 1;
		numbers[1] = 23;
		numbers[2] = 10;
		numbers[3] = -121;
		numbers[4] = 12;
// output as hash code form
		System.out.println(numbers);

// Desired output with the help of loop
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}
