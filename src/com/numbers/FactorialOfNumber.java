package com.numbers;

import java.util.Scanner;

@FunctionalInterface
interface factorial {

	public void isFactorial(int n);

}

public class FactorialOfNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		factorial fac = n -> {
			// Initializing the variable fact with 1;
			int fact = 1;
			int i;
			// Taking loop
			System.out.print(n + "! = ");
			for (i = n; i >= 1; i--) {
				fact = fact * i;

				if (i == 1) {

					System.out.print(i + " = " + fact + ".");
				} else {
					System.out.print(i + " x ");
				}
			}
		};
		System.out.println("Enter the number");
		fac.isFactorial(sc.nextInt());
	}

}
