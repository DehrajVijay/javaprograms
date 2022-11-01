package com.ArithmeticOperations;

import java.util.*;

public class ArithmetiOperations {

	public static void main(String[] args) {
		// To find the sum of n natural numbers taking input from the user.
		int i = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int number = sc.nextInt();
		while (i <= number) {
			sum = sum + i;
			i = i + 1;
		}

		System.out.println("The sum of the numbers is: " + sum);

	}
}
