package com.String;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {

		String s = "care";
		String p = "race";

		// CHECK IF THE LENGTH IS SAME
		if (s.length() == p.length()) {
			// convert strings to char array

			char[] charArray1 = s.toCharArray();
			char[] charArray2 = p.toCharArray();

// sort the two arrays
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			// if sorted char arrays are same then the string is anagram

			boolean result = Arrays.equals(charArray1, charArray2);

			if (result) {
				System.out.println(s + " and " + p + " are anagram.");
			} else {
				System.out.println(s + " and " + p + " are not anagram.");

			}
		} else {
			System.out.println(s + " and " + p + "are anagram.");
		}
	}
}
