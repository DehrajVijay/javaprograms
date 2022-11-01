package com.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		 int temp;
		int numbers[] = { 2, 4, 12, 8, 11 };

		for (int i = 0; i < numbers.length; i++) {

			 temp = numbers[0];
			numbers[0] = numbers[4];

			numbers[1] = numbers[0];
			numbers[2] = numbers[1];
			numbers[3] = numbers[2];
			numbers[4] = numbers[3];
			System.out.println(temp);

		}

	}
}
