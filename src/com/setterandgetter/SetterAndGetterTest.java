package com.setterandgetter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SetterAndGetterTest {

	public static void main(String[] args) throws Exception {
		try {
			Scanner sc = new Scanner(new File("C:\\Users\\DEHRV001\\Desktop\\clm_6792.txt"));
			List<Object> integers = new ArrayList<>();
			int line = 0;
			while (sc.hasNext()) {
				if (sc.hasNext()) {
					integers.add(sc.next());
				} else {
					sc.next();
				}
			}
			System.out.println(integers);
			/*
			 * System.out.println(integers); System.out.println(integers.get(2));
			 */
			String currency = (String) integers.get(2);
			String newCurr = (String) integers.set(4,currency);
			System.out.println(integers);
			System.out.println(currency);
			System.out.println(newCurr);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("handled...");
			
			
			

		}
	}
}