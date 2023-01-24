package com.practice;

public class Animal_2 {
	String colour;
	int age;

// Creating a method which takes two parameters of type String and Int.
	void character(String c, int a) {
		colour = c;
		age = a;
	}

// Creating a method to print.
	void display() {
		System.out.println("The colour of buzo is  " + colour + " The age of buzo is " + age);
	}

	public static void main(String[] args) {
		// Referencing
		Animal_2 buzo = new Animal_2();
		buzo.character("black", 12);
		buzo.display();
	}

}
