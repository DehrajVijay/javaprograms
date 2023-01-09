package com.practice;

public class ValidateMobile {
	public void validate() {
		System.out.println("The first method");
	}

	String blast() {
		return "to be updated";
	}

	public static void main(String[] args) {
		ValidateMobile v1 = new ValidateMobile();
		v1.blast();
		v1.validate();
		System.out.println("This is the code to be checked");
	}
}
