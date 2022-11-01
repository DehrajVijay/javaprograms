package com.Arrays;

import java.util.*;

public class ArrayClosestNumber {

	public static void main(String[] args) {
		int a[];
		int find;
		int closest = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		a = new int[size];
		System.out.println("Enter the elements in array");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("The number are ");
		for (int i = 0; i < size; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("Enter the Number to find closest value of");
		find = sc.nextInt();
		int distance = Math.abs(closest - find);
		System.out.println("distance is "+distance);
		for (int i : a) {
			int distance1 = Math.abs(i - find);
			System.out.println("distance1 "+distance1);
			if (distance > distance1) {
				closest = i;
				distance = distance1;

			}
		}
		System.out.println("Closest value to the number is : " + closest);
	}

}
