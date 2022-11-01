package com.Arrays;

public class ArraysSum {
	public static void main(String[] args) {
		int i;

		int[] mixnumbers = new int[] { 14, 18, 12, 3, 5, 7 };

		System.out.println(" The elements of mixed array are: ");

		for (i = 0; i < mixnumbers.length; i++) {
			System.out.println(mixnumbers[i]);
		}
		System.out.println(" The Even numbers are: ");
		for (i = 0; i < mixnumbers.length; i++) {
			if (mixnumbers[i] % 2 == 0) {
				System.out.println(mixnumbers[i]);
			}

		}
		System.out.println("The Odd numbers are :");
		for (i = 0; i < mixnumbers.length; i++) {
			if (mixnumbers[i] % 2 != 0) {
				System.out.println(mixnumbers[i]);
			}
		}
		int evensum = 0;
		System.out.println("The sum of even numbers of an array is:");
		for (i = 0; i < mixnumbers.length; i++) {
			if (mixnumbers[i] % 2 == 0) {
				evensum = evensum + mixnumbers[i];
			}
		}
		System.out.println(evensum);

		System.out.println("The sum of Odd numbers of an array is:");
		int oddsum = 0;
		for (i = 0; i < mixnumbers.length; i++) {
			if (mixnumbers[i] % 2 != 0) {
				oddsum = oddsum + mixnumbers[i];
			}
		}
		System.out.println(oddsum);
	}
}