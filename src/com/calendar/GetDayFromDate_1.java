package com.calendar;

import java.util.Calendar;

import java.util.Scanner;

public class GetDayFromDate_1 {
	public String daysOfWeek(int day, int month, int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, day);// here 0-january, 1-fabruary and so on.
		// create string array of week
		String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		int n;
		n = cal.get(cal.DAY_OF_WEEK);// It witll return an integer form 1-7 and 1->sunday and so on.
		return (days[n - 1]);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter the date as(dd/mm/yyyy)");
		str = sc.nextLine();
		int day = Integer.parseInt(str.substring(0, 2));
		int month = Integer.parseInt(str.substring(3, 5));
		int year = Integer.parseInt(str.substring(6, 10));
		GetDayFromDate_1 gt = new GetDayFromDate_1();
		System.out.println(gt.daysOfWeek(day, month, year));
	}

}
