package com.HackerRank.StringToken;

import java.util.Scanner;

public class StringTokenizer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to split");
		String s = scan.nextLine();
		//using Pattern class split() method 
		// checking the condition if not empty
		if (!s.trim().isEmpty()) {
			//the split method();
			// then split the expressions and store the string 
			//element in a String array
			String str[] = s.trim().split("[,\\s?.@!,_']+");
			// using .length method to get the length of string
			System.out.println(str.length);
			// for-each loop to traverse the new array
			for (String st : str) {
				System.out.println(st);
			}
		} else {
			System.out.println("0");
		}
		scan.close();
	}

}
