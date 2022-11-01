package com.numbers;

import java.util.*;

class PrimeNumberCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you wanat to check");
		int i, n = sc.nextInt();
		int sum = 0;
		for (i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum = sum + 1;

			}
		}
		System.out.println("Total factors of " + n + " is/are = " + sum);
		if (sum == 2) {
			System.out.println("This is a prime number");

		} else {
			System.out.println("This is not a prime number");
		}

	}
}