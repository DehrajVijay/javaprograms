package com.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression_3 {
	static int count = 0;
	static Pattern p = Pattern.compile("vijay");
	static Matcher m = p.matcher("vijaydehrajisthewriterofapnijavablog");
	static Matcher m1 = p.matcher("vijaydehrajisthewriterofapnijavablog");
	static Matcher m2 = p.matcher("vijaydehrajisthewriterofapnijavablog");

	public static void starting() {
		while (m.find()) {
			count++;
			System.out.println(m.start());
		}
	}

	public static void ending() {
		while (m1.find()) {

			System.out.println(m1.end());
		}
	}

	public static void grouping() {
		while (m2.find()) {

			System.out.println(m2.group());
		}
	}

	public static void main(String[] args) {
//calling the methods for printing
		 
		System.out.println("The starting index/indices is: ");
		starting();
		System.out.println("The ending index/indices is: ");

		ending();
		System.out.println("The searched object is: ");
		grouping();
		System.out.println("The occurrence of the searched object is: " + count);
	}

}
