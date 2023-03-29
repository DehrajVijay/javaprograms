package com.Leetcode.questions;

import java.util.Scanner;

public class PowerOfThree {
	public static boolean isPowerOfThree(int n) {
		long i = 1;
		while (i < n) {
			i = i * 3;
		}
		return i == n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check. ");
		System.out.println(PowerOfThree.isPowerOfThree(sc.nextInt()));
	}
}
