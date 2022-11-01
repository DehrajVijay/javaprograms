package com.Arrays;

import java.util.*;

public class ArraysMaxMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] numbers = new int[2][3];

		// for input the the first outer loop
		System.out.println("Enter the Elements");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {

				numbers[i][j] = sc.nextInt();
			}
		}
//Printing the array 

		
		
		
		
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			int max = numbers[0][0];
			int min = numbers[0][0];
			if (max < numbers[0][0])
				max = numbers[i][j];
			if (max < numbers[i][0])
				min = numbers[i][0];
			System.out.println(max + " " + min);
		}
		System.out.println(" ");
	}
}
