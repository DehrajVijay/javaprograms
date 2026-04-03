package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidVoter {

	public static void isValid(int age) throws UnderAgeException {

		if (age >= 18) {
			System.out.println("Valid User");
		} else {
			throw new UnderAgeException("You are under age", age);
		}
	}

	public static void main(String[] args) throws IOException {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter the age");
			int input = Integer.parseInt(br.readLine());
			if (input > 6) {
				isValid(input);
			}else {
				System.out.println("you are a kid!!");
			}

			br.close();
		} catch (UnderAgeException e) {
			System.out.println(e.getMessage());
			System.out.println("You are " + e.getAge());
		}
	}
}