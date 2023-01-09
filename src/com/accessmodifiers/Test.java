package com.accessmodifiers;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int[] numbers = { 1, 2, 3, 4, 5 };
		
		
 by using scanner class of java we can take input from the user
 and the Scanner class of java tha is basically used to take input form the user is already predefined class
 
		System.out.println("Enter the elements");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("The output is:" + numbers[i]);
		}
		for (int i = 0; i < numbers.length; i++) {
			int[] numSum = { numbers[i] + numbers[i + 1] };
		}
	}
}