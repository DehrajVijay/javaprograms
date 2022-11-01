package com.lambdaexpression;

import java.util.*;

class Employee1 {
	String name;
	int eno;

	Employee1(String name, int eno) {
		this.name = name;
		this.eno = eno;
	}

	public String toString() {
		return name + eno;
	}
}

public class LambdaCollection4 {

	public static void main(String[] args) {

		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("Vinit", 107));
		l.add(new Employee("Rajeev", 105));
		l.add(new Employee("Anish", 103));
		l.add(new Employee("Madhuri", 104));
		l.add(new Employee("Vijay", 100));
		System.out.println("Output according to Insertion order\n");
		System.out.println(l + "\n====================================================");
		System.out.println("Output after sorting according to Emp Id\n");
		Collections.sort(l, (e1, e2) -> (e1.eno < e2.eno) ? -1 : (e1.eno > e2.eno) ? 1 : 0);
		System.out.println(l + "\n====================================================");

		// sorting according to their names

		System.out.println("Sorting according to the Names\n");
		Collections.sort(l, (e1, e2) -> e1.name.compareTo(e2.name));
		System.out.println(l + "\n=====================================================");

	}

}
