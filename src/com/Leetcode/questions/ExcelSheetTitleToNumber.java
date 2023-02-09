package com.Leetcode.questions;

class Sol {
	public int titleToNumber(String columnTitle) {
		int result = 0;
		int factor = 1;
		int i;
		for (i = columnTitle.length() - 1; i >= 0; i--) {
			result += factor * (columnTitle.charAt(i) - 'A' + 1);
			factor *= 26;

		}
		return result;

	}

}

public class ExcelSheetTitleToNumber {

	public static void main(String[] args) {
		Sol su = new Sol();

		System.out.println(su.titleToNumber("A"));

		System.out.println(su.titleToNumber("AB"));
		System.out.println(su.titleToNumber("ABC"));
		System.out.println(su.titleToNumber("ABCD"));

		System.out.println(su.titleToNumber("BCD"));

		System.out.println(su.titleToNumber("BCD"));

	}

}
