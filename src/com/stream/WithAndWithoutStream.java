package com.stream;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class WithAndWithoutStream {

	// without using Stream.
	public static void findEvenWithoutStream() {
		List<Integer> integer = List.of(17, 0, 12, 25, 35, 19, 10, 01);
		System.out.println("All Integers are: " + integer);
		List<Integer> evenList = new ArrayList<>();

		for (Integer i : integer) {
			if (i % 2 == 0) {
				evenList.add(i);
			}
		}
		System.out.println("\nThe Even Integers are: " + evenList);
	}

	public static void findOddWithoutStream() {
		List<Integer> integer = List.of(17, 0, 12, 25, 35, 19, 10, 01);
		List<Integer> OddList = new ArrayList<>();
		for (Integer i : integer) {
			if (i % 2 != 0) {
				OddList.add(i);
			}
		}
		System.out.println("The Odd Integers are: " + OddList);
	}

	// code becomes much concise with the use of Stream and lambda Expression.
	public static void findEvenWithStream() {
		List<Integer> integer = List.of(17, 0, 12, 25, 35, 19, 10, 01);
		List<Integer> evenList2 = integer.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("\nEven Integers using Stream: " + evenList2);
	}

	// code becomes much concise with the use of Stream and lambda Expression.
	public static void findOddWithStream() {
		List<Integer> integer = List.of(17, 0, 12, 25, 35, 19, 10, 01);
		List<Integer> oddList2 = integer.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		System.out.println("Odd Integers using Stream: " + oddList2);
	}

	public static void main(String[] args) {
		// Static Method calling.
		findEvenWithoutStream();
		findOddWithoutStream();
		findEvenWithStream();
		findOddWithStream();
	}

}