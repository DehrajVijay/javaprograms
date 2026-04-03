package com.exceptionhandling;

public class InvalidAgeException extends Exception {
	private int age;

	public InvalidAgeException(String message) {
		//super(message);
		//this(message, 0);

	}

	public InvalidAgeException(String message, int age) {
		super(message);
		this.age = age;
	}

	public int getAge() {

		return age;
	}
}
