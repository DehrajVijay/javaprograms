package com.Leetcode.questions;

public class FindTheMajorityElements {

	public static void main(String[] args) {

		// Initializing array
		int[] nums = new int[] { 3, 2, 3, 4, 5, 3, 8, 7, 7, 4, 2, 1 };

		// Creating another array which will store the frequency of element.
		int[] frequency = new int[nums.length];

		// Taking a variable to check the visited elements.
		int visited = -1;

		// Traversing the array
		for (int i = 0; i < nums.length - 1; i++) {
// Initializing the count value with 1.
			int count = 1;

			// Taking another loop to compare the elements.
			for (int j = i + 1; j < nums.length; j++) {
				// Comparing if the elements of array at alternate indices are equal or not.
				if (nums[i] == nums[j]) {
					// If the are equal, increment the count by 1.
					count++;

					// To avoid counting same element again
					frequency[j] = visited;
				}
			}
			if (frequency[i] != visited) {
				// If frequency is not equal to visited, store the value of count to frequency
				frequency[i] = count;
			}
			// Displaying the frequency of each element present in array.

		}
		System.out.println("=============================");
		System.out.println("Element 		|  		Frequency");
		System.out.println("=============================");
		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] != visited) {
				System.out.println("     " + nums[i] + "			|			" + frequency[i]);
			}
		}
		System.out.println("=============================");
	}
}
