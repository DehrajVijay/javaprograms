package com.lambdaexpression;

import java.util.Scanner;

@FunctionalInterface
interface PrintEven {
	public void print(int num1, int num2);

}

public class LambdaPractice_2 {
	public static void main(String[] args) {
		System.out.println("Enter the number to be checked for even or odd");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		PrintEven p = (a, b) -> {
			if (num1 % 2 == 0 || num2 % 2 == 0) {
				System.out.println("This is an even number");
			} else {
				System.out.println("This is an odd number");

			}
		};
		p.print(num1, num2);
	}

}
