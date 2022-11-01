package com.Arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.Collections;

import java.util.stream.Collectors;

public class ArrayFindDuplicates {

	public static void main(String[] args) {
		String[] companies = new String[] { "Meta", "Apple", "Amazon", "Netflix", "Google", "Apple", // duplicate
				"Microsoft", "Elevate", "Amazon" // duplicate
		};
//Print the original string
		System.out.println("Original companies are: \n");
		Arrays.stream(companies).forEach(System.out::println);
		System.out.println("Total number of companies are");

		// get the unique elements after removing the duplicates

		System.out.println("The unique elements are: \n");
		Set<String> distinctCompanies = Arrays.stream(companies).collect(Collectors.toSet());

		// print unique elements after removal of duplicates

		System.out.println("The unique elements in the string array are: \n");
		distinctCompanies.forEach(System.out::println);
n
		// count the unique elements
		System.out.println("The number of unique elements are:");

		System.out.println(distinctCompanies.size());

		// get duplicate elements from the array
		Set<String> duplicateCompanies = Arrays.stream(companies)
				.filter(company -> Collections.frequency(Arrays.asList(companies), company) > 1)
				.collect(Collectors.toSet());

		//printing the duplicates elements
		System.out.println("The duplicates elements in the array are:\n");
		duplicateCompanies.forEach(System.out::println);

		//Counting the duplicate elements
		System.out.println("The number of duplicat elements are: \n" + duplicateCompanies.size());
	}

}
