package com.lambdaexpression;

import java.util.*;

class MyComparator implements Comparator<Integer> {
	public int compare(Integer I1, Integer I2) {
		// If-else statement by using Operator
		return (I1 < I2) ? -1 : (I1 > I2) ? +1 : 0;

	}

}

public class LambdaCollection2 {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(12);
		l.add(-12);
		l.add(02);
		l.add(34);
		l.add(17);
		l.add(12);
		l.add(10);
		System.out.println("Here is the output");
		System.out.println("This output is according the Insertion order");
		System.out.println(l);
		
		//for the customized sorting order
	Collections.sort(l,new MyComparator());
	System.out.println("Customized sorting according to asscending order");
	System.out.println(l);
	}

}
