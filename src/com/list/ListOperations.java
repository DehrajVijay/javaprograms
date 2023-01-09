package com.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperations {

	public static void main(String[] args) {
		// Creating a List of type Integer using ArrayList
		List<Integer> l1 = new ArrayList<Integer>();

		// using Scanner class to take the input from the user.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		// creating a variable 'n'
		// n=numbers of elements.
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			// using methods for list
			l1.add(n);
			 
		}
		// System.out.println(l1);
	}

}
