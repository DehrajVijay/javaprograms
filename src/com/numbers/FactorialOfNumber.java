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
			// Taking loop 
			for (int i = n; i >= 1; i--) {
				fact = fact * i;

			}
			System.out.print(n + "! is " + fact+".");

		};
		System.out.println("Enter the number");
		fac.isFactorial(sc.nextInt());
	}

}
