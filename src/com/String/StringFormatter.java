package com.String;

public class StringFormatter {

	public static void main(String[] args) {
		int[] number = { 12, 13, 14, 15 };
		for (int i : number) {

			String stringFormatter = String.format("%03d", i);
			System.out.println(stringFormatter);
		}

	}
}