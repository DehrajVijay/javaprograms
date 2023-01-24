package com.collections;

//creating a user-defined class to use this in another another class.
public class Student {

	String name;
	Integer rollno;
	Integer age;

//creating a parameterised constructor. 
	public Student(String name, Integer age, Integer rollno) {

		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}

// The toString method must be overriden to get the list printed 
//otherwise while printing the list, hascode will be printed.
	@Override
	public String toString() {
		return name + " " + rollno + " " + age;

	}
}
