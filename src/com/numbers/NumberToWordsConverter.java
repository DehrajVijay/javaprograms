package com.numbers;

import java.text.NumberFormat;
import java.util.Scanner;

public class NumberToWordsConverter {
	// Taking a String[] array with String values  One ,Two ,....Ninteen  < 100
	// Only these values are required because other values can be made from these values
	// Like If I want to take 25 then it will be made from these arrays.
	public static String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
			"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Ninteen" };

	public static String[] tens = { 
		// Taking two blank String in the starting to keep the index position according to 
			// the actual index.
			// For example, If I say 5 then Fifty sould come at index 5th and so on.
			"", 				// 0
			"", 				// 1
			"Twenty", 	//2
			"Thirty", 		//3
			"Forty",		//4
			"Fifty", 			//5	
			"Sixty", 		//6
			"Seventy", 	//7
			"Eighty", 		//8
			"Ninety"		//9

	};

	public static String convert(int n) {
		if (n < 0) {
			return "Minus" + convert(-n);
		}
		// If the number is < 20, return value from the units array present at index n.
		if (n < 20) {
			
			return units[n];
		}
		// If the number is < 100, let us say 54 
		// 54=50+4 which contains tens place and units place both
		// So, It will return tens place first and then units place
		if (n < 100) {
			return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
		}
		if (n < 1000) {
			// same logic as above
			return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + convert(n%100);

			
		}
		if (n < 100000) {
			return convert(n / 1000) + " Thousand " + ((n % 10000 != 0) ? " " : "") + convert(n % 1000);
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
