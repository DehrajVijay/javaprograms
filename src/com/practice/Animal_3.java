package com.practice;

public class Animal_3 {
	String colour;
	int age;

	// creating a constructor
	Animal_3(String colour, int age) {
		this.colour = colour;

		this.age = age;
		System.out.println("The colour of buzo is  " + colour + " and the age of buzo is " + age);
	}

	public static void main(String[] args) {
		// Referencing
		Animal_3 buzo = new Animal_3("black", 12);
		
	}
}
