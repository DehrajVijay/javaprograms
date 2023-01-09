package com.Arrays.sorting;

import java.util.*;

public class AddArraysPratice {

	public static void main(String[] args) {
		int i, k, l, size;
		int[] firstList = { 12, 1, 3, 4 };
		System.out.println("The elements of first List are: ");
		for (i = 0; i < firstList.length; i++) {
			System.out.print(firstList[i] + " ");
		}
		int[] secondList = { 2, 3, 4, 5 };
		System.out.println();
		System.out.println("The elements of Second List are: ");
		for (i = 0; i < firstList.length; i++) {
			System.out.print(secondList[i] + " ");
		}
		k = firstList.length;
		l = secondList.length;
		size = k + l;
		int[] combinedList = new int[k + l];
		int m = 0;
		int n = 0;
		int o = 0;

		while (i < k) {
			combinedList[o++] = firstList[i++];
		}
// traverse the elements of array2 and add into array3.
		while (i < l) {
			combinedList[o++] = secondList[i++];

		}
		/*
		 * for (i = 0; i < k + l; i++) { System.out.println(combinedList[i]); }
		 */
		System.out.println(combinedList[o]);

	}

}
