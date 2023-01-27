package com.Leetcode.questions;

public class FindSingleNumber {

	public static int singleNumber(int[] nums) {
		// In this code using XOR which is a bitwise operator.
		// The XOR operator is denoted by a carror(^) symbol. It takes two values and
		// returns true if they are different.
		// Oterwise returns false. In binary, the true is represented by 1 and false is
		// represented by 0.
		// Note this method is applicable only for numbers presnet twice and if more
		// than two time a number
		// is present then it will not work.

		// Initialising xor variable
		int xor = 0;
		// Traversing arrays
		for (int num : nums) {

			// working of XOR
			// Comparing two numbers
			// let us say x and y the x^y will be
			// 0 ^ 0 = 0
			// 0^1=1
			// 1^0=1
			// 1^1=0
			xor = xor ^ num;
		}
// Returing the value which is not repeating
		return xor;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 1, 2, 3, 3, 4 };
		System.out.println("The only single number present in the array is:");
		System.out.println(FindSingleNumber.singleNumber(nums));
	}

}
