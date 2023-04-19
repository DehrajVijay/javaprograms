package com.numbers;

import java.util.Scanner;

public class CubeOrSquareRoot {

	static boolean checkPerfectSquare(double number) {
		for (int i = 1; i <= number / 2; i++) {
			// if i*i=number this is perfect square else not.
			if (number % i == 0 && number / i == i) {
				System.out.println(i);
				return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number.");
		double number = sc.nextDouble();
		double lastDigit = number % 10;
		System.out.println("The last digit is: " + lastDigit);
		if (lastDigit == 2 || lastDigit == 3 || lastDigit == 7 || lastDigit == 8) {
			System.out.println("Not a perfect square.");
		} else if (checkPerfectSquare(number)) {
			System.out.println("Yes, Number is a perfect square");
		} else
			System.out.println("NO, Number is not a perfect square.");
	}
}