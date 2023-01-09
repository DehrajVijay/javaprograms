package com.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression_4 {
	static int count = 0;
	static Pattern p = Pattern.compile("[abc]");
	static Matcher m = p.matcher("a@b123#");

	public static void starting() {
		System.out.println("using [abc]");

		while (m.find()) {
			count++;
			System.out.println(m.start());
		}

	}
	//
	public static void starting_1() {
		System.out.println("using [abc]");

		while (m.find()) {
			count++;
			System.out.println(m.start());
		}

	}

	public static void main(String[] args) {
		starting_1();
	}

}
