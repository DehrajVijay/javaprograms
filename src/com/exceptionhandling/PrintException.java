package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of x and y");
		try {
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(x / y);

		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (InputMismatchException e) {
			System.out.println(e.getClass().getName());
		}
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
	}

}
