package com.collection;

import java.util.ArrayList;

public class ConvertArrayListToArray {
// Method 1: Using ArrayList class get() method.
	public static void main(String[] args) {
		// Creating and Initializing ArrayList
		ArrayList<String> fruits = new ArrayList<>();
		// adding elements to this ArrayList
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Pear");
		fruits.add("Water Melon");

		// ArrayList to String array conversion.
		// Creating a String array of size of fruits type of ArrayList.
		String[] str = new String[fruits.size()];
		
		// Traversion the elements
		for (int i = 0; i < fruits.size(); i++) {
// Fetching each element and store them in the new String type of array.
			// .get() method returns the element at the specified position in the List.
			str[i] = fruits.get(i);
		}

		// Printing the elements using for-each loop
		for (String s : str) {
			System.out.println(s);
		}
	}

}
