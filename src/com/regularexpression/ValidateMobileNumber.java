package com.regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateMobileNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user name");
		String name = sc.next();
		Pattern p = Pattern.compile("[a-z]$");
		Matcher m = p.matcher(name);

		if (m.find() && m.group().equals(name)) {
			System.out.println("Valid user name");
		} else {
			System.out.println("Invalid user name");
		}
	}

}
