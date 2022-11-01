package com.Arrays;

public class ArrayAverage {

	public static void main(String[] args) {

		double[] numbers = new double[] { 12, 14, 25, 10.0 };
		double sum = 0;
		double average;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];

		}
		System.out.println("The sum of the elements is:" + sum);
		average = sum / numbers.length;
		System.out.println("The average of the elements is:" + average);
	}

}
