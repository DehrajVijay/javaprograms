package com.practice;

import java.util.Scanner;

public class OnlineRegistration {
	static int registration = 0;

	public static void register() {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Enter your name");
		for (int i = 1; i <= 5; i++) {

		}
		System.out.println(registration++);

	}

	public static void main(String[] args) {
		// int count = 0;
		boolean flag;
		int limit = 5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.nextLine();
		flag = true;
		if (flag == true) {
			registration++;
			System.out.println(name + " your registration number is :" + registration);

		}
		sc.close();

		register();
	}

}
