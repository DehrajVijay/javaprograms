package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWithMap {
	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(45);
		marks.add(85);
		marks.add(43);
		marks.add(77);
		marks.add(88); 
		marks.add(81);

		System.out.println(marks);
		// If we want to process the object and want a new object after performing some
		// functionality, we use map() method.
		// Let us say 5 marks are awarded to every student as grace.

		List<Integer> UpdatedMarks = marks.stream().map(i -> i + 5).collect(Collectors.toList());
		System.out.println("The Updated Marks of the students are: " + UpdatedMarks);

<<<<<<< HEAD
		List<Integer> modifiedmarks = marks.stream().map(i -> i + 5).collect(Collectors.toList()).stream().map(i->i+10).collect(Collectors.toList());
		System.out.println("The Updated Marks of the students are: " + modifiedmarks);

=======
		
>>>>>>> 5ed2821c4037627f2b9e47a3eaf7301d1ac82e8e
	}

}
