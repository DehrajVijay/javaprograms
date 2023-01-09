package com.regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmailAddress {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Email");
		String id = sc.nextLine();
		// Pattern class is to check for the specific pattern
		// present in java.util package
		Pattern p = Pattern.compile("[a-z A-Z 0-9][a-z A-Z 0-9_.]*@[a-z A-Z 0-9]+([.][a-z A-Z]+)+");
		//Matcher class in java present in the java.util.regex method.
		Matcher m = p.matcher(id);
		if (m.find() && m.group().equals(id)) {
			System.out.println("Valid Email Address");
		} else {
			System.out.println("Invalid Email Address");
		}
	}

}
