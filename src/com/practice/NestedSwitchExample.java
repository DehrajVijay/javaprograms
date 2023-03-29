package com.practice;

import java.util.Scanner;

public class NestedSwitchExample {
	public static void main(String args[]) {
		// C - CSE, E - ECE, M - Mechanical
		Scanner sc = new Scanner(System.in);
		int category;
		int subcat;
		String choice = "Y";

		while (choice.equalsIgnoreCase("Y")) {
			System.out.println("press 1 for laptops.");
			category = sc.nextInt();
			switch (category) {
			case 1:
				System.out.println("press 1 for dell\n press 2 for apple.");
				subcat = sc.nextInt();
				switch (subcat) {
				case 1:
					System.out.println("This is dell latptop.");

					System.out.println("Do You Want to order more ?\nPress Y for yes or N for no");
					choice = sc.next();
					if (choice.equalsIgnoreCase("Y")) {
						System.out.println("Plese Enter your choice");
					} else {
						System.out.println("Thanks for your visit");
					}
					break;
				case 2:
					System.out.println("This is Apple laptop.");
					System.out.println("Do You Want to order more ?\nPress Y for yes or N for no");
					choice = sc.next();
					if (choice.equalsIgnoreCase("Y")) {
						System.out.println("Plese Enter your choice");
					} else {
						System.out.println("Thanks for your visit");
					}
					break;

				default:
					System.out.println("case 2 apple Wrong choice");
						break;//switch break.
				
				}
			break;
			default:
				System.out.println("main Wrong choice.");
				System.out.println("Do You Want to order more ?\nPress Y for yes or N for no");
				choice = sc.next();
				if (choice.equalsIgnoreCase("Y")) {
					System.out.println("Plese Enter your choice");
				} else {
					System.out.println("Thanks for your visit");
				}
				break;
			}
			//sc.close();
		}
	}
}