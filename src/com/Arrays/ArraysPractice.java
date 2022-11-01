package com.Arrays;

import java.util.*;

public class ArraysPractice {

	public static void main(String[] args) {
		float find;
		float closest = 0;
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		size = sc.nextInt();
		float[] nums = new float[size];
//for input elements
		System.out.println("Enter the elements");
		for (int i = 0; i < size; i++) {
			nums[i] = sc.nextFloat();
			System.out.println(nums[i]);

		}
		System.out.println();
		System.out.println("Enter the number to find the closest number");
		find = sc.nextFloat();
		float distance = Math.abs(closest - find);
		System.out.println("The distance is: " + distance);
		for (float i : nums) {
			float newDistance = Math.abs(i - find);
			System.out.println("The new distance is: " + newDistance);
			if (distance > newDistance) {
				closest = i;
				distance = newDistance;
			}
		}
		System.out.println("the closest value is: " + closest);
	}
}
