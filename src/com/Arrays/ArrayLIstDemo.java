package com.Arrays;

import java.util.ArrayList;

public class ArrayLIstDemo {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();

		// using add() method to add elements
		l.add("GOUTAM");
		l.add("RAMKESH");
		l.add("PANKAJ");
		l.add("SOURAV");
		l.add("VIJAY");	
		l.add("NITIN");
		// array output
		System.out.println("Normal output\n" + l);
		System.out.println("Size of the Array List is: " + l.size());
		// adding element at particular index in an ArrayList.
		l.add(2, "JASMINE");
		System.out.println("output after adding at index 2\n" + l);
		System.out.println("Size of the Array List is: " + l.size());
		// removing particular elements form the ArrayList
		l.remove("JASMINE");
		System.out.println("Output after removing the particular element\n " + l);
		System.out.println("Size of the Array List is: " + l.size());
		// removing particular elements form the ArrayList
		l.remove(5);
		System.out.println("Output after removing index 5\n" + l);
		System.out.println("Size of the Array List is: " + l.size());
	}
}
