package com.palindrome;

public class StringPalindrome {

	public static void main(String[] args) {
		String reverse = "";
		String s = "MADAM";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}

		System.out.println(reverse);
		if (s.equals(reverse)) {
			System.out.println("This is a palindrome");
		} else {
			System.out.println("This is not a palindrome");
		}
	}
}
