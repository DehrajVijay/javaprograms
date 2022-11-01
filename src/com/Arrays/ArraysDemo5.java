package com.Arrays;

import java.util.*;

public class ArraysDemo5 {

	public static void main(String[] args) {
		int array1[] = { 22, 33, 44 };
		int array2[] = { 22, 33, 44 };

		if (array1 == array2) {
			System.out.println(" Same ");
		} else
			System.out.println("not same");

		if (Arrays.equals(array1, array2)) {
			System.out.println("same");
		} else
			System.out.println("not same");
	}

}
