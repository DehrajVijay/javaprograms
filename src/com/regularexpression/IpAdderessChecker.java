package com.regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpAdderessChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Ip address to be validate");
		String Ip = sc.nextLine();

		Pattern p = Pattern.compile("\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5]");
		Matcher m = p.matcher(Ip);

		if (m.find() && m.group().equals(Ip)) {
			System.out.println("Valid Ip address");

		} else {
			System.out.println("InValid Ip address");
		}
	}

}
