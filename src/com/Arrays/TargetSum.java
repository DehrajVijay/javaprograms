package com.Arrays;

public class TargetSum {
	static void printing() {
		System.out.println("Index\tNumber\tSum");
	}

	public static void main(String[] args) {

		int i, j, target = 12;
		int[] numbers = { 1, 2, 3, 0, -12, 12 };
		boolean result = false;
		for (i = 0; i < numbers.length; i++) {
			for (j = i + 1; j < numbers.length; j++) {
				if (numbers[j] ==target-numbers[i] ) {

					System.out.println(i + "," + j + "\t" + numbers[i] + "," + numbers[j] + "\t" + target);
					result = true;
				}
			}

		}
		if (result) {
			printing();
		}
		if (!result) {
			System.out.println("No such combination present");
		}

	}
}
