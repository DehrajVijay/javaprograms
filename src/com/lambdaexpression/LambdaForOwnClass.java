package com.lambdaexpression;

import java.util.function.*;

class Employee {
	String name;
	int eno;

	Employee(String name, int eno) {
		this.name = name;
		this.eno = eno;
	}

	public String toString() {
		return name + eno;

	}
}

public class LambdaForOwnClass {

	public static void main(String[] args) {

		Employee e = new Employee("Vijay", 101);
		System.out.println(e);
	}

}
