package com.Arrays;

import java.util.Arrays;

public class ArrayCyclicallyRotate {

	static int[] array = new int[] { 1, 2, 3, 4, 5 };

	// method for rotation
	static void rotate() {
		int temp = array[array.length - 1], i;
		for (i = array.length - 1; i > 0; i--)
			array[i] = array[i - 1];
		System.out.println(array[i]);
		array[0] = temp;
		 
	}

	public static void main(String[] args) {
		System.out.println("The original array is :");
		System.out.println(Arrays.toString(array));
		rotate();
		System.out.println("The rotated array is :");
		System.out.println(Arrays.toString(array));

	}

}
