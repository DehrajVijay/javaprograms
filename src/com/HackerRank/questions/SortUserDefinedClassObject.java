package com.HackerRank.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// Creating a user-defined class object
class Student {
	private int id;
	private String fname;
	private double cgpa;

	// Creating Parameterized-Constructor 
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;

	}

	public String getFname() {
		return fname;

	}

	public double getCgpa() {
		return cgpa;

	}

}

//Create comparator class 
class StudentComparator implements Comparator<Student> {
	double diff = 0;

	@Override
	public int compare(Student s1, Student s2) {
		//Returns the absolute value of a double value
		if (Math.abs(s1.getCgpa() - s2.getCgpa()) > diff) {
			return s1.getCgpa() < s2.getCgpa() ? 1 : -1;
		}else if (!s1.getFname().equals(s2.getFname())) {
			return s1.getFname().compareTo(s2.getFname());
		} else {
			return s1.getId() - s2.getId();
		}
	}
}

public class SortUserDefinedClassObject {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of Test Cases");
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			// Creating student object
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			testCases--;
		}
		// Sort list with comparator
		Collections.sort(studentList, new StudentComparator());
		for (Student st : studentList) {
			System.out.println(st.getFname());
		}
	}

}
