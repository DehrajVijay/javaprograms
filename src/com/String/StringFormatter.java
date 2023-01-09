package com.String;

public class StringFormatter {

	public static void main(String[] args) {
		String s = "0";
		System.out.println("The input is: ");
		int[] number = { 12, 13, 14, 15 };
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		System.out.println("The output is: ");
		for (int i : number) {

			System.out.println(s + i);
		}

	}
}