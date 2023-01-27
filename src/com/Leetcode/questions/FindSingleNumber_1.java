
// code under observation and practice

package com.Leetcode.questions;

import java.util.Scanner;

public class FindSingleNumber_1 {
	public static int singleNum(int[] nums) {
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
		for (int i : nums) {
			// working of XOR
			// Comparing two numbers
			// let us say x and y the x^y will be
			// 0 ^ 0 = 0
			// 0^1=1
			// 1^0=1
			// 1^1=0
			xor = xor ^ i;
		}
		return xor;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the odd number size of one-D Array");
		int size = sc.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elemetns in array");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		// The original array
		System.out.println("The original Array is : ");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println("The Single number present in the array is: ");
		System.out.println(FindSingleNumber_1.singleNum(nums));
	}

}
