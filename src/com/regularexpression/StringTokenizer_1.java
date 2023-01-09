package com.regularexpression;

import java.util.StringTokenizer;

public class StringTokenizer_1 {

	public static void main(String[] args) {

		// StringTokenizer is a predefined java class which by default takes space \s as
		// regular expression

		StringTokenizer st = new StringTokenizer("happy to be in elevate ","e");
		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
	}

}
