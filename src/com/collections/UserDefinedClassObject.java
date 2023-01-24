package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class UserDefinedClassObject {

	public static void main(String[] args) {
		// Creating user-defined class objects
		Student s1 = new Student("Jasmine", 22, 101);
		Student s2 = new Student("Dimple", 17, 102);

		Student s3 = new Student("Shiv", 30, 103);
		Student s4 = new Student("Ram", 31, 104);

		// Creating ArrayList
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);

		al.add(s3);
		al.add(s4);

		// Iteration
		Iterator<Student> itr = al.iterator();
		// traversing elements of ArrayList objects
		while (itr.hasNext()) {
			System.out.println(itr.next());
			/*
			 * Student st = (Student) itr.next(); System.out.println(st.rollno + " " +
			 * st.age + " " + st.name); }
			 */

		}

	}
}
