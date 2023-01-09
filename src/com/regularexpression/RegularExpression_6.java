package com.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression_6 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("a");
		Matcher m = p.matcher("abcaabcaaadef");
		while (m.find()) {
			System.out.println(m.start() + "......." + m.group());
		}
		System.out.println();
		Pattern p1 = Pattern.compile("a+");
		Matcher m1 = p1.matcher("abcaabcaaade");
		System.out.println("using a+ for the group of occurrences\n");
		while (m1.find()) {
			System.out.println(m1.start() + "......." + m1.group());
		}

	}

}
