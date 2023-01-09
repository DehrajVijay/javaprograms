package com.datatype;

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class RangeOfDataType {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to be chacked");
		try {
			long x = scan.nextLong();
			if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
				System.out.println(x + " can be fitted in\n");
				System.out.println("int\n" + "long\n" + "byte\n");
			}
		} catch (Exception e) {
			System.out.println(scan.next() + "can not be fitted anywhere");

		}
	}
}