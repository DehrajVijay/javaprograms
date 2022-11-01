package com.String;

import java.util.Scanner;

public class IntToString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		Integer number = sc.nextInt();
		String s = null;
		s = Integer.toString(number);
		if (number == Integer.parseInt(s)) {
			System.out.println("Good Job");
		} else {
			System.out.println("Wrong Answer");
		}
		 
	}

}
