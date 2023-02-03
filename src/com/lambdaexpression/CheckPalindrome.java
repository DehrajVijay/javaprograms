package com.lambdaexpression;

import java.util.Scanner;

@FunctionalInterface
interface palindo {

	void check(int n);
}

public class CheckPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		palindo pal = n -> {
			int temp;
			int rem;
			temp = n;
			int reverse = 0;
			while (n > 0) {
				rem = n % 10; // getting the remainder.
				reverse = (reverse * 10) + rem;
				n = n / 10; // New value of n.
			}
			if (temp == reverse)
				System.out.println(temp + " is a palindrome");
			else
				System.out.println(temp + " is not a palindrome");
		};
		System.out.println("Enter the number to check if it is a palindrome or not");
		pal.check(sc.nextInt());
	}

}
