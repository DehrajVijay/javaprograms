package com.Arrays.sorting;

import java.util.Arrays;

public class ArrayFillMethod {

	public static void main(String[] args) {

		// initializing object array.
		Object array[] = new Object[] { 1.2, 2, 3, 4.5, 2.9, 7 };
		// print the array
		System.out.println("The original array is ");

		for (Object number : array) {
			System.out.println(number);
 
 
		}
//using Arrays.fill() to fill the elements in the array

		Arrays.fill(array, 2, 4, 10);
		System.out.println("New array after insertion of elements");
		for (Object number : array) {
			System.out.println(number);
		}
	}

}


