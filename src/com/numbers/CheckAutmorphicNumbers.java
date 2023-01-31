package com.numbers;

import java.util.Scanner;

public class CheckAutmorphicNumbers {

	public static void checknumber(int num) {
		int squaredNum = num * num;
		int lastTwoDigits = squaredNum % 100;
		System.out.println("The Squared number is "+squaredNum+".");
		if (lastTwoDigits == num)
			System.out.println(num + " is an automorphic number.");
		else
			System.out.println(num + " is not an automprphic number.");
// This program is to check if this number taken from user is an automorphic number or the main difference 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to be checked.");
// Direct static method calling
		checknumber(sc.nextInt());
		// TODO Auto-generated method stub

	}

}
