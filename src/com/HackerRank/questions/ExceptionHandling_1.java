package com.HackerRank.questions;

import java.util.Scanner;

class MyCalculator {

//creating a method 'power' with two parameters which is throwing exception
	public long power(int n, int p) throws Exception {
		// taking a variable 'res'
		long res;
		// checking the condition for the integers
		if (n < 0 || p < 0) {

			// if both are negative then it should thrown an exception.
			throw new Exception("n or p should not be negative.");
		}
		// checking if both the numbers are == 0
		if (n == 0 && p == 0) {
			// if both the numbers are == 0 , again it should throw an exception
			throw new Exception("n and p should not be zero.");
		}
		// other wise if both the conditions are not true which means if both the
		// numbers are > 0 then it should return the power of p of n.
		return res = (long) Math.pow(n, p);

	}
}

public class ExceptionHandling_1 {
	// creating the object of class MyCalculator.
	public static final MyCalculator my_calculator = new MyCalculator();
	public static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number 'n' and then enter the power 'p'");

		int n = in.nextInt();
		int p = in.nextInt();

		try {
			System.out.println(my_calculator.power(n, p));
		} catch (Exception e) {
			// If the condition does not satisfied, it will print the exception
			System.out.println(e);
		}

	}
}
