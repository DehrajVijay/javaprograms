package com.palindrome;

public class PalindromeNumber {

	/*
	 * public boolean isPalindrome(int x) {
	 * 
	 * 
	 * 
	 * return false;
	 * 
	 * }
	 */

	public static void main(String[] args) {
		int x, last, first, mid, fr;
		// 121,1221,12321,1234321
		x = 121;
		first = x / 10;

		mid = first % 10;
		last = x % 10;
		fr = first / 10;

		String palin = last + "" + mid + "" + fr;
	 System.out.println(palin);
		/*
		 * System.out.println(first); System.out.println(mid); System.out.println(last);
		 * System.out.println(fr);
		 */

		
		/*
		 * In Java, directly comparing a String to an int in an if condition will result in a compile-time error because 
		 * they are of different types and cannot be directly compared.
		 * The == operator is used to compare primitive types or object references but not objects of different 
		 * types like String and int.
		 * String is a reference type, while int is a primitive type.				
		 */
		/*
		 * if (palin.equals(String.valueOf(x))) { System.out.println("true"); } else {
		 * System.out.println("false"); }
		 * 
		 * if (Integer.parseInt(palin) == x) { System.out.println("true hai"); } else {
		 * System.out.println("false hai"); }
		 */
		
			if (palin.equals(String.valueOf(x))) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
	
	}
}
