package com.collection;

import java.util.ArrayList;

public class ConvertArrayListToArray2 {

	// Using ArrayList class toArray() method.
	// a) Using toArray() method to convert ArrayList to Object Array.
	// b) Iterate each element and convert them to the desired type using
	// typecasting.

	public static void main(String[] args) {

		// Instantiating and Initializing ArrayList

		ArrayList<String> cities = new ArrayList<>();
		cities.add("Rohtak");
		cities.add("Chandigarh");
		cities.add("Jind");
		cities.add("New your");
		cities.add("Shimla");

		// ArrayList to String array conversion using toArray();
		// .toArray method returns an array containing all of the elements in this list inproper
		//sequence (from first to last element);
		String[] citinames = cities.toArray(new String[cities.size()]);

		// Printing the elements using for-each loop
		for (String str : citinames) {
			System.out.println(str);
		}
	}

}
