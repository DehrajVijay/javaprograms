package com.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InfiniteInputsFromUser {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		// int n = 0;
		// ArrayList<Object> alist = new ArrayList<Object>();
		String s = "end";

		System.out.println("Enter the numbers");
		while (Integer.parseInt(br.readLine().equals(s))) {
			/*
			 * if (Integer.parseInt(br.readLine()).equals(s)) {
			 * System.out.println("terminated"); break; } else { sc1.next(); }
			 */

		}
	}
}
