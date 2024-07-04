package com.HackerRank.questions;

import java.io.*;
import java.util.*;

public class StringTokens {
	static Scanner scan = new Scanner(System.in);
	static String s = scan.nextLine();

	public static void way1() {
		scan.close();

		// Write your code here.

		StringTokenizer st = new StringTokenizer(s, " !,?.@'_");

		int tokenCount = st.countTokens();
		System.out.println(tokenCount);

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
	// way 2 using split method

	@toString
	public static void way2() {

		String[] tokens = s.split("[ !,?.@'_]+");

		// Printing the number of tokens
		System.out.println(tokens.length);

		// Printing each token
		for (String token : tokens) {
			System.out.println(token);
		}

	}

	public static void main(String[] args) {
		// way1();
		way2();
	}

}
