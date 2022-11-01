package com.ArithmeticOperations;
import java.io.*;
import java.util.Scanner;

public class PrintingTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("test %d case");
		System.out.println("Enter the number ");

		int number = sc.nextInt();
		System.out.println("The Table of " + number + " is ");
		System.out.println();
		for (int i = 0; i <= 10; i++) {
			System.out.println(number + " x " + i + " = " + number * i);
			//sc.close();
		}

	}

}
