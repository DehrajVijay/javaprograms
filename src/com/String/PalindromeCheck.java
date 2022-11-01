package com.String;

import java.util.*;

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a three-digits number");
		String s = sc.next();
		System.out.println("Your number is ");
		System.out.println(s);
		if (s.length() == 3) {
			if (s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2)) {
				System.out.println(" Alerady a palindrome");

			} else if (s.charAt(0) == s.charAt(2)) {
				System.out.println("Already a Palindrome");

			} else if (s.charAt(0) != s.charAt(2) && s.charAt(0) == s.charAt(1)) {
				System.out.println(s.charAt(1) == s.charAt(2));
			} else
				System.out.println("The number should be of three digits");
		}
	}
}