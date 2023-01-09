package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram_1 {

	static void isAnagram(String str1, String str2) {
		Scanner sc = new Scanner(System.in);
		str1 = sc.nextLine();
		str2 = sc.nextLine();
		// remove white spaces from the strings.
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		boolean status = true;
		// check if the length of the string are equal or not.
		if (s1.length() != s2.length()) {
			status = false;
			System.out.println(s1 + " and " + s2 + " are not Anagrams");
		} else {
			char[] arrayS1 = s1.toCharArray();
			char[] arrayS2 = s2.toCharArray();
			Arrays.sort(arrayS1);
			Arrays.sort(arrayS2);
			//This is to check the code against the package of java.util
			status = Arrays.equals(arrayS1, arrayS2);
			if (status) {
				System.out.println(s1 + " and " + s2 + " are Anagrams");
			} else {
				System.out.println(s1 + " and " + s2 + " are not Anagrams");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the WORD to check for anagram");
		isAnagram("", "");

	}
}
