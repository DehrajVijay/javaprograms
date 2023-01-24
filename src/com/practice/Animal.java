package com.practice;

//Initializing objects by reference variable

public class Animal {

	String colour;
	int age;

	public static void main(String[] args) { // TODO Auto-generated method stub

		Animal buzo = new Animal();
		// Initializing the objects by reference variable

		buzo.colour = "black";
		buzo.age = 12;

		System.out.println("The colour of buzo is  " + buzo.colour + " The age of buzo is " + buzo.age);
	}

}
