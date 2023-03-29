package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWithSortedMethod {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(17);
		marks.add(85);
		marks.add(43);
		marks.add(77);
		marks.add(88);
		marks.add(33);
		System.out.println("Marks of Students in Exam.");
		System.out.println(marks);
		// To sort the numbers, Sorted() method is good to use.
		List<Integer> sortedList = marks.stream().sorted().collect(Collectors.toList());
		System.out.println("Natural Sorting Order: " + sortedList);

		/*
		 * for customized sorting order, use comparator.
		 *
		 * Comparator-->compare(obj1,obj2) returns -ve iff obj1 has to come before obj2.
		 * returns +ve iff obj1 has to come after obj2. returns 0 iff obj1 and obj2 are
		 * equal.
		 * 
		 */
		List<Integer> CustomizedSortedOrder = marks.stream().sorted((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0)
				.collect(Collectors.toList());
		System.out.println("Customized Sorting Order: " + CustomizedSortedOrder);
		List<Integer> SortedOrder = marks.stream().sorted((i1, i2) -> i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("Sorting Order by using compareTo(natural) : " + SortedOrder);

		// If we want to get customized sorting order by using compareTo method,add -
		// sign.
		List<Integer> cusSortedOrder = marks.stream().sorted((i1, i2) -> -i1.compareTo(i2))
				.collect(Collectors.toList());
		System.out.println("Sorting Order by using compareTo(customized) : " + cusSortedOrder);
	}

}
