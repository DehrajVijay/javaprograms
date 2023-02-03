package com.numbers;

import java.util.Scanner;
import java.lang.Math;

public class CheckAmstrongNumber {
// function to check if the number is Armstrong or not
	static boolean isArmstrong(int n) {
		int temp, digits = 0, last = 0, sum = 0;

		// assigning n into a temp variable.
		temp = n;
		// Loop to execute until the condition becomes false
		while (temp > 0) {
			temp = temp / 10;
			digits++;

		}
		temp = n;
		while (temp > 0) {

			last = temp % 10;
// calculates the power of a number up to digit times and add the resultant to the sum
			sum = (int) (sum + (Math.pow(last, digits)));
			temp = temp / 10;
		}
		// comparing the sum with number n.

		if (n == sum) {
			// returs if sum and n are equal
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Amstrong Number: Is a number which has the sum of the cubes of its digits equals to the number itself ");
		System.out.println("Enter the number to check.");

		int n = sc.nextInt();
		if (isArmstrong(n)) {

			System.out.println("Armstrong number.");
		} else {
			System.out.println("Not an Armstrong number.");
		}

	}
}