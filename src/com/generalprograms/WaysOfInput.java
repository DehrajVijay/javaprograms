package com.generalprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WaysOfInput {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the name");
		String name = br.readLine();
		System.out.println("Enter the age");
		int age = Integer.parseInt(br.readLine());
		System.out.println("Enter the float number");
		float f = Float.parseFloat(br.readLine());
		// br.close();
	}

}
