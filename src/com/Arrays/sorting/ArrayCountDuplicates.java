package com.Arrays.sorting;

import java.util.Arrays;

public class ArrayCountDuplicates {

	public static void countFrequency(int[] array, int l) {

		boolean[] visited = new boolean[l];

		Arrays.fill(visited, false);

		// traverser through array elements and count the frequencies.

		for (int i = 0; i < l; i++) {

			// skip the element if already processed
			if (visited[i] == true)
				continue;

			// count the frequency
			int count = 1;
			for (int j = i + 1; j < l; j++) {
				if (array[i] == array[j]) {
					visited[j] = true;
					count++;

				}
			}
			System.out.println(array[i] + "             " + count);
		}
	}

	public static void main(String[] args) {

		int[] array = new int[] { 10, 2, 2, 45, 9, 7, 10, 45, 9 };
		// to print the actual values
		System.out.println("The acutal array is : ");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + "\t");
		int l = array.length;
		System.out.println();
		System.out.println("The frequency of elements is:");
		countFrequency(array, l);

	}

}
