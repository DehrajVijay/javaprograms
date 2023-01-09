package com.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression_5 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\s");
		Matcher m = p.matcher("abc@123 apnijava");
		Pattern p1 = Pattern.compile("\\S");
		Matcher m1 = p1.matcher("abc@123 apnijava");

		Pattern p2 = Pattern.compile("\\w");
		Matcher m2 = p2.matcher("abc@123 apnijava");

		System.out.println("using \\s for space");
		System.out.println();
		while (m.find()) {
			System.out.println("The match is present at: index " + m.start());
		}
		System.out.println("using \\S for characters other than space");
		System.out.println();
		while (m1.find()) {
			System.out.println("The match is " + m1.group() + "  present at: index " + m1.start());
		}
		System.out.println();
		System.out.println("using \\w for any word character" + "\n");
	
		System.out.println("The match is present at: index ");
		while (m2.find()) {
			System.out.println("The match is " + m2.group() + "  present at: index " + m2.start());
		}

	}

}
