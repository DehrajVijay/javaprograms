package com.numbers;

import java.text.NumberFormat;
import java.util.Scanner;

public class NumberToWordsConverter {
	// Taking a String[] array with String values One ,Two ,....Ninteen < 100
	// Only these values are required because other values can be made from these
	// values
	// Like If I want to take 25 then it will be made from these arrays.
	// The Logic behind taking the string as blank and not "Zero" at the first index
	// is if the number is < 100 and it is has 0 at its unit's place then it will
	// return the index
	// as let us say the number is 30, so after 30 % 10 = [0] and if there is "Zero"
	// at the 0th index it will print "Thirty Zero" which is a wrong conversion in
	// words.
	// So beter is to keep is blank at 0th index and make another if condition for 0
	// which will return "Zero".
	public static String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
			"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Ninteen" };

	public static String[] tens = {
			// Taking two blank String in the starting to keep the index position according
			// to
			// the actual index.
			// For example, If I say 5 then Fifty sould come at index 5th and so on.
			"", // 0
			"", // 1
			"Twenty", // 2
			"Thirty", // 3
			"Forty", // 4
			"Fifty", // 5
			"Sixty", // 6
			"Seventy", // 7
			"Eighty", // 8
			"Ninety" // 9

	};

	public static String convert(int n) {
		if (n < 0) {
			return "Minus" + convert(-n);
		}
		if (n == 0) {
			return "Zero";
		}
		// If the number is < 20, return value from the units array present at index n.

		if (n < 20) {

			return units[n];
		}

		// If the number is < 100, let us say 54
		// 54=50+4 which contains tens place and units place both
		// So, It will return tens place first and then units place
		if (n < 100) {
			// The reason why the convert function is not called here is, if the number is
			// <100 then it can be made out of the tens and units array itself.
			return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
		}

		if (n < 1000) {
			// Calling the convert function here and
			return units[n / 100] + " Hundred " + ((n % 100 != 0) ? "" : '"') + convert(n % 100);
		//	+ ((n % 10000 != 0) ? " " : "")
		}
		if (n < 100000) {
			return convert(n / 1000) + " Thousand "  + convert(n % 1000);
		}
		if (n < 10000000) {
			return convert(n / 100000) + " Lakh " + ((n % 100000 != 0) ? " " : "") + convert(n % 100000);
		}

		return convert(n / 10000000) + " Crore " + ((n % 10000000 != 0) ? " " : "") + convert(n % 10000000);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to convert into word format");
		int n = sc.nextInt();
		System.out.println(NumberFormat.getInstance().format(n) + " = " + convert(n) + ".");
	}

}
