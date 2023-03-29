package com.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamWithCount {

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
		Long numberOffailedStudents = marks.stream().filter(i -> i < 35).count();
		System.out.println("Number of Failed Students = " + numberOffailedStudents);

		Long numberOfPassedStudents = marks.stream().filter(i -> i > 35).count();
		System.out.println("Number of Failed Students = " + numberOfPassedStudents);

	}

}
