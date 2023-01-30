package com.lambdaexpression;

import java.util.Scanner;
//Automorphic numbers : If the last two digits of the squared number are equal to the number, then this is called an automorphic number.


@FunctionalInterface
interface funcint {
	public void isAutomorphicNumber(int n);
}

public class AutomorphicNumbers {

	public static void main(String[] args) {
		// This is to find the automorphic number
		Scanner sc = new Scanner(System.in);
		// Taking reference to call functional Interface
		funcint fun = n -> { // The body of functional Interface
			int squarednum = n * n;
			System.out.println("The squared number is " + squarednum+".");
			// Finding the last two digits of the number.
			int lastTwoDigit = squarednum % 100;
		// Comparing the number with the last two digits of the squared number.
			if (n == lastTwoDigit)
				System.out.println(n + " is an automorphic number.");
			else
				System.out.println(n + " is not an automorphic number.");
		};
		System.out.println("Enter the number.");
		// Method calling
		fun.isAutomorphicNumber(sc.nextInt());
	}

}
