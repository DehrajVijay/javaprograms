package com.regularexpression;

import java.util.regex.Pattern;

public class RegularExpression_7 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[a]");
		String[] s = p.split("Apni Java By Vijay Dehraj");

		for (String s1 : s) {
			System.out.println(s1);
		}
	}

}
