package com.collections;

import java.util.ArrayList;
import java.util.Collections;

class Employee {
	String name;
	int empno;

	Employee(String name, int empno) {
		this.name = name;
		this.empno = empno;

	}

	@Override
	public String toString() {
		return name + "  " + empno + " ";

	}
}

public class UserDefinedClassObject_2 {

	public static void main(String[] args) {
// Creating an ArrayList of Employee type
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("Shiva", 100));
		al.add(new Employee("Jasmine", 89));
		al.add(new Employee("Bond", 97));
		al.add(new Employee("Pankaj", 55));
		al.add(new Employee("Viijay", 1012));

		System.out.println("\n******The elements in the ArryaList without sorting******\n");

		System.out.println(al + "    ");
		// user comparator to get the desired sorting order
		Collections.sort(al, (e1, e2) -> (e1.empno < e2.empno ? -1 : e1.empno > e2.empno ? 1 : 0));
		// Array List after sorting based on empno.
		System.out.println("\n******ArrayList after sorting based on empno******\n");
		System.out.println(al);

		// To sort according to the names of employees
		// again as we know this is also not the default sorting order so we will use
		// Comparator here as well.
		Collections.sort(al, (e1, e2) -> (e1.name.compareTo(e2.name)));
		System.out.println("\n******ArrayList after sorting based on names of the employees******\n");
		System.out.println(al);

	}

}
