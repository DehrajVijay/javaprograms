package com.lambdaexpression;

import java.util.Scanner;

// @ annotation to check the conditions for functional interface.
@FunctionalInterface
interface funInt {
// containing only one abstract method which does not have body
	public void primeornot(int n);
}

// creating a class which has main method
public class PrimeChecker {
	public static void main(String[] args) {
// Using Scanner class to take the input form the user
		Scanner sc = new Scanner(System.in);
// To hold the lambda expression, some reference must be there and that is the corresponding functional interface.
		funInt fi = (n) -> {
			
			boolean isPrime = true;
// checking the condition with the for loop.
			// can not divide 0 and no use of dividing by 1 so starting the loop from 2.
			for (int i = 2; i <=n / 2; i++) {
				// finding the remainder by dividing the value of n by i
				// first i=2,3,4... till n\2
				// let us say n=4; then 4%2 remainder =0 and it fulfills the if condition and set the 
				// isPrime to false , and break the for loop. 
				int res = n % i;
				// If the remainder ==0, then set the isPrime to false;
				if (res == 0) {
					isPrime = false;
					break;

				}
			}
			if (n == 1 || n == 0)

				System.out.println(n + " is neither prime not composite");
			else if (isPrime)
				System.out.println(n + " is a prime number");
			else
				System.out.println(n + " is not a prime number");

		};
		System.out.println("Enter the number to be checked");
		fi.primeornot(sc.nextInt());
	}
}