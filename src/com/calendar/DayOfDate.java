package com.calendar;

import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

public class DayOfDate {

	public static String findDay(int month, int day, int year) {
		// Create a new calendar
		Calendar myCal = Calendar.getInstance();
		// Set the current date using calendar fields. Note: The month indices start
		// from 0.
		myCal.set(year, month - 1, day);
		// Get the day of the week field of this calendar
		switch (myCal.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.MONDAY:
			return "MONDAY";
		case Calendar.TUESDAY:
			return "TUESDAY";
		case Calendar.WEDNESDAY:
			return "WEDNESDAY";
		case Calendar.THURSDAY:
			return "THURSDAY";
		case Calendar.FRIDAY:
			return "FRIDAY";
		case Calendar.SATURDAY:
			return "SATURDAY";
		case Calendar.SUNDAY:
			return "SUNDAY";
		default:
			return myCal.get(Calendar.DAY_OF_WEEK);
		}

	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Date as DD MM YYYY format");
		String[] firstMultipleInput = new String[3];

		int month = Integer.parseInt(firstMultipleInput[0]);
 

		int day = Integer.parseInt(firstMultipleInput[1]);

		int year = Integer.parseInt(firstMultipleInput[2]);

		String res = DayOfDate.findDay(month, day, year);
	}

}
