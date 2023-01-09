package com.regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class ValidUserName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username");
		String name = sc.nextLine();
		Pattern p = Pattern.compile("[a-zA-Z]{4,8}");
		Matcher m = p.matcher(name);
		if (m.find() && m.group().equals(name)) {
			System.out.println("valid user name");
		} else {
			System.out.println("Invalid user name");
		}

	}
}
