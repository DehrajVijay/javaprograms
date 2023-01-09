package com.regularexpression;

import java.util.regex.*;

public class RegularExpression_2 {
	static Pattern p = Pattern.compile("[abc]");
	static Matcher m = p.matcher("a@b123#");

	static Pattern p1 = Pattern.compile("[^abc]");
	static Matcher m1 = p1.matcher("a@b123#");

	static Pattern p2 = Pattern.compile("[0-9]");
	static Matcher m2 = p2.matcher("a@b123#");

	static Pattern p3 = Pattern.compile("[a-z A-Z 0-9]");
	static Matcher m3 = p3.matcher("a@b123#");

	static Pattern p4 = Pattern.compile("[^a-z A-Z 0-9]");
	static Matcher m4 = p4.matcher("a@b123#");

	public static void main(String[] args) {
		System.out.println("Using [abc]\n");

		// to search object using find() method
		// giving conditions
		while (m.find()) {
			System.out.println("The object searched at index : " + m.start() + "---and----" + "The object mathced is "
					+ m.group() + "\n");
		}
		// to search object other than desire search
		System.out.println("Using [^abc]\n");
		while (m1.find()) {
			System.out.println("The object searched at index : " + m1.start() + "---and----The object mathced is "
					+ m1.group() + "\n");

		}

		// to search for the digits
		System.out.println("Using [0-9]\n");
		while (m2.find()) {

			System.out.println("The digit present is : " + m2.group() + " at the indiex " + m2.start() + "\n");
		}
		System.out.println("Using [a-z A-Z 0-9]\n");

		while (m3.find()) {

			System.out.println("The match  present is : " + m3.group() + " at the indiex " + m3.start() + "\n");
		}
		System.out.println("Using [^a-z A-Z 0-9]\n");

		while (m4.find()) {

			System.out.println(
					"The special character present is : " + m4.group() + " at the indiex " + m4.start() + "\n");
		}
	}
}
