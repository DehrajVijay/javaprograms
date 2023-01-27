package com.HackerRank.questionsc;

import java.util.ArrayList;
import java.util.Scanner;

public class FindThePositionOfInteger {

	public static void main(String[] args) {
		// Using the dynamic size arrays.
		System.out.println("How many lines you want the values for ?");
		// taking input from user
		Scanner in = new Scanner(System.in);
		// n= number of lines the ArrayList will have
		int n = in.nextInt();
		// creating an ArrayList of ArrayList type
		ArrayList<ArrayList<Integer>> l = new ArrayList<>();
		// This will add the integers into the ArrayList
		System.out.println("how many integers would this line have?");
		for (int i = 0; i < n; i++) {
			// creating another ArrayList of Integer type which will store the integers in
			// temp.
			ArrayList<Integer> temp = new ArrayList<>();
			// d=how many integers would this line have.
			int d = in.nextInt();
			// Entering the Integers in temp
			System.out.println("Enter the integers");
			for (int x = 0; x < d; x++) {
				temp.add(in.nextInt());
				// System.out.println(l);
			}
			// adding these integers in the main ArrayList
			l.add(temp);
		}
		System.out.println("How many queries you want to perform");
		int q = in.nextInt();
		System.out.println("Enter the index to search the value for");
		// can check which integer is present at particular index
		// a=line number
		// b=position in that line
		for (int i = 0; i < q; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			try {
				// .get() method returns the element at the specified position in this list.
				System.out.println(l.get(a - 1).get(b - 1));

			} catch (Exception e) {
				System.out.println("ERROR!");
			}
		}
		in.close();
	}
}
