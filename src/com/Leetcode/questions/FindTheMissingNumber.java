package com.Leetcode.questions;

class Test {
	// Question: Find the missing number in the array.
	// if an array contains n elements then the range of that
	// array will be from 0-1 and the elements will be present withing this range.
	// find the only missing number in this array.
	// the approach is to find the natural number sum till the max number in that array
	// and then subtract the sum of elements presnet in the array.
	// the result will be the missing number.
	int missingNumber(int[] nums) {
		int arraysum = 0;
		int naturalsum = 0;
		int missingnumber = 0;
		int n = nums.length;

		for (int i = 0; i < nums.length; i++) {
			arraysum = arraysum + nums[i];
		}
		naturalsum = n * (n + 1) / 2;

		missingnumber = naturalsum - arraysum;
		return missingnumber;
	}
}

public class FindTheMissingNumber {

	public static void main(String[] args) {
		int[] nums = { 1, 5, 0, 3, 2 };
		Test st = new Test();
		System.out.println("The missing number in the array is ");
		System.out.println(st.missingNumber(nums));
	}

}
