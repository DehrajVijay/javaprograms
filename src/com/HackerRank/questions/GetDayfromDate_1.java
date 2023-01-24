package com.HackerRank.questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Locale;

// Creating a findDay method 
class Result {
	public static String findDay(int day, int month, int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, day);
		String dayMonth = cal.getDisplayName(cal.DAY_OF_WEEK, cal.LONG, Locale.US).toUpperCase();
		return dayMonth;
	}
}

public class GetDayfromDate_1 {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the data");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] firstMultipleInput = br.readLine().replaceAll("\\s+$", "").split(" ");
		int month = Integer.parseInt(firstMultipleInput[0]);
		int day = Integer.parseInt(firstMultipleInput[1]);
		int year = Integer.parseInt(firstMultipleInput[2]);
		String res = Result.findDay(day, month, year);
	}

}
