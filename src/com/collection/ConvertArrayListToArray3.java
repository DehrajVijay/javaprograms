package com.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayListToArray3 {
// Using Arrays class copyOf() method.
	// i) first convert the ArrayList to Object array using toArray() method.
	// ii) Use Array.copyOf() method to convert the Object array to String array.

	public static void main(String[] args) {

		// Declaring and initializing ArrayList in one step.
		ArrayList<String> webs = new ArrayList<>();
		webs.add("Google Chrome");
		webs.add("Brave");
		webs.add("Edge");
		webs.add("Mozilla Firefox");

		// Converting ArrayList to String Array using copyOf() method.
// copyOf() method returns a copy of the original array, truncated or padded with nulls to obtain the specified length.
		String[] webnames = Arrays.copyOf(webs.toArray(), webs.size(), String[].class);

		// Displaying the elements using for-each loop

		for (String s : webnames) {

			System.out.println(s);
		}
	}

}
