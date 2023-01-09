package com.Arrays.sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SelectionSorting {

	public static void main(String[] args) throws IOException {
		int size;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of array");
		size = Integer.parseInt(br.readLine());
		int[] numbers = new int[size];
		System.out.println("Enter the numbers for the array");
		for (int i = 0;i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}
		int min, temp = 0;
		for (int i = 0; i < numbers.length; i++) {
			min = i;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] < numbers[i]) {

					min = j;
				}
			}
			if (numbers[i] < numbers[min]) {
				temp = numbers[i];
				numbers[i] = numbers[min];
				numbers[min] = temp;

			}
		}
		for (int i = 0; i < numbers.length; i++) {

			System.out.print(numbers[i] + " ");
		}
		br.close();

	}

}
