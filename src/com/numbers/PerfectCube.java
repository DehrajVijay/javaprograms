package com.numbers;

import java.util.Scanner;

public class PerfectCube {
	static boolean checkPerfectCube(double number) {

		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0 && number / i == i * i) {
				System.out.println(i);
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number.");
		double number = sc.nextDouble();
		if (checkPerfectCube(number)) {
			System.out.println("The number is a perfect cube.");
		} else
			System.out.println("The number is not a perfect cube.");
	}

}
