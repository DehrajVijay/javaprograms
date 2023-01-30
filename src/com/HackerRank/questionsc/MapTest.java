package com.HackerRank.questionsc;

import java.util.Map;

import java.util.Scanner;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		Map<String, Integer> hp = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
		hp.put("James", 905098989);
		hp.put("Jasmine", 888098989);
		hp.put("Rock", 178);
		hp.put("Rock", 225);

		System.out.println("Enter the names to check in the directory ");
		Scanner sc = new Scanner(System.in);
		// String name = "";
		while (sc.hasNext()) {
			String name = sc.nextLine();

			System.out.println(hp.containsKey(name) ? name + "=" + hp.get(name) : "Not found");
		}
	}
}
