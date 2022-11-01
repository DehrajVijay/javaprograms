package com.Arrays.sorting;

import java.util.*;

public class ArraysMerge {

	public static void main(String[] args) {
		// declaration and initialization
		int[] array1 = { 7, 3, 5, 1, 9 };
		int[] array2 = { 10, 4, 8, 2, 6 };

		int l1 = array1.length;
		int l2 = array2.length;
		int[] array3 = new int[l1 + l2];

		mergeArrays(array1, array2, l1, l2, array3);
		System.out.println("Elements of first Array");
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		System.out.println("Elements of second Array");
		for (int j = 0; j < array2.length; j++)
			System.out.println(array2[j]);
		System.out.println("Sorted list of Arrays after merge");
		for (int i = 0; i < l1 + l2; i++)
			System.out.print(array3[i] + " ");

	}

	public static void mergeArrays(int array1[], int array2[], int l1, int l2, int[] array3) {
		int i = 0;
		int j = 0;
		int k = 0;

		// traverse the elements of array1 and add into array3.
		while (i < l1) {
			array3[k++] = array1[i++];
		}
		// traverse the elements of array2 and add into array3.
		while (j < l2) {
			array3[k++] = array2[j++];

		}
//The sorted array after merger
		Arrays.sort(array3);
	}
}