package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(18);
		l.add(41);
		l.add(15);
		l.add(-8);
		l.add(-91);
		l.add(0);
		l.add(114);
		l.add(24);
		l.add(35);
		l.add(36);
		// It will print all the Integers present in the Array List.

		System.out.println("Natural Numbers present in ArrayList are: " + l);
		// But if we want to process any specific data from the ArrayList,
		// then we can use Stream.
		// To get the even numbers from the ArrayList using Stream.
		// stream().filter(), takes predicate reference as an argument. Predicate is a
		// functional interface. So, we can also pass lambda expression here.
		List<Integer> l2 = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("The Even Integers are:" + l2);

		// To get the odd numbers from the ArrayList using Stream.
		List<Integer> l3 = l.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		System.out.println("The Odd Integers are:" + l3);
	}

}
