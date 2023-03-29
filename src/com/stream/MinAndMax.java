package com.stream;

import java.util.ArrayList;

public class MinAndMax {

	public static void main(String[] args) {

		ArrayList<Integer> runs = new ArrayList<Integer>();
		runs.add(17);
		runs.add(85);
		runs.add(43);
		runs.add(77);
		runs.add(88);
		runs.add(33);
		System.out.println("Runs:");
		System.out.println(runs);
		// For Maximum value
		Integer max = runs.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Maximum runs :" + max);
		// For Minimum value
		Integer min = runs.stream().max((i1, i2) -> i2.compareTo(i1)).get();
		System.out.println("Minimum runs :" + min);
	}

}
