
package com.numbers;

import java.util.Scanner;

public class PowerOfTwo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		String subjects = null;
		System.out.println("enter the choice");
		System.out.println("Press 1 for 1st year.\nPress 2 for 2nds year.\nPress 3 for 3rd year.");
		num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("Subjects are:\nEnglish,maths,science.");
			break;
		case 2:
			System.out.println("Subjects are:\nEnglish,maths,science,social science.");
			break;
		case 3:
			System.out.println("Subjects are:\nEnglish,maths,computer,history.");
			break;
		default:
			System.out.println("Wrong selection");
			break;
		}

	}
}
