package com.regularexpression;

import java.util.regex.*;

public class RegularEXpression_1 {

	public static void main(String[] args) {
		int count = 0;

		// creating a pattern object that needs to be search in the string

		Pattern p = Pattern.compile("vijay");
		// creating a matcher object to search from
		Matcher m = p.matcher("vijaydehrajanddehrajvijay");
		/*
		 * Matcher m1 = p.matcher("vijaydehrajanddehrajvijay"); Matcher m2 =
		 * p.matcher("vijaydehrajanddehrajvijay");
		 */
	//	 operation using find() method
		System.out.println("The searched object is :");

		while (m.find()) {

			// printing using start() method.
			// start() method will print the starting index of the occurrence.
			// end() will print the ending index of the occurrence.
			// group() will print the matched object
			System.out.println(m.end());
			System.out.println(m.start());
			//System.out.println(m.group());
			
			
		}
		
		  System.out.println("The searched object is present at index/indices at: ");
		  while (m.find()) {
		  
		 System.out.println(m.start());
		  
		  }
		  
			
			  System.out.println("The searched object is ended at index/indices at: ");
			  while (m.find()) { count++; m.start(); System.out.println(m.end()); }
			  
			  System.out.println("The required object is present " + count + " times ");
			 
		  
		 
	}
}
