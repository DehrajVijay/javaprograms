package com.ArithmeticOperations;

import java.util.*;

public class VowelConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character ");
		String line = sc.next();
		char character = line.charAt(0);
// using switch for the cases
		switch (character) {
		case 'A':
		case 'E':
		case 'I':		case 'O':
		case 'U':
		 case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(character + " is a vowel");
			break;
		}
		System.out.println("is a consonant");
	sc.close();
	
	}
	

}
