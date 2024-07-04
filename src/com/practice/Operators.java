package com.practice;

public class Operators {
	void checkCondition(int a, int b) {
		String ans = a > b ? "false" : "true";
		System.out.println(ans);
	}

	static void comparison(int a, int b, int c, int d) {
		int ans = 0;
		if (a > b || b > c) {
			System.out.println(true);
		} else
			System.out.println(false);

	}

	public static void main(String[] args) {

		/*
		 * Operators obj = new Operators(); obj.checkCondition(18, 31);
		 */

		// comparison(12, 10, 44, 15);

		int a = 33;
		// even
		if (a % 2 == 0) {
			System.out.println(a/2);
			System.out.println("even");

		}else if(a%2!=0) {
			System.out.println(a/2);
			System.out.println("odd");
		}
	}
}
