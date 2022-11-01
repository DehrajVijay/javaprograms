package com.lambdaexpression;

import java.util.*;

class LambdaCollection {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(3);
		l.add(-40);
		l.add(15);
		l.add(60);
		// for the natural sorting order
		System.out.println("This is the natural sorting order");
		System.out.println(l);
		// for customised sorting order
		System.out.println("This is the customised sorting order");
		Collections.sort(l);
		System.out.println(l);
	}
}