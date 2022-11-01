package com.Arrays;

import java.util.Arrays;

public class ArrayCyclicallyRotate2 {

	static int[] array = new int[] { 1, 2, 3, 4, 5 };

	static void rotate() {
		int i = 0;
		 int j = array.length - 1;
		while (i != j) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
i++;
		}

	}

	public static void main(String[] args) {
		
		System.out.println("The given array is: ");
		System.out.println(Arrays.toString(array));
		
		rotate();
		System.out.println("The sorted array is: ");
		System.out.println(Arrays.toString(array));
	}

}
