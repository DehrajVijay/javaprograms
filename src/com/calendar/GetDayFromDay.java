package com.calendar;

import java.time.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class GetDayFromDay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the complete date");
		String s = sc.nextLine();
		Calendar cal = Calendar.getInstance();
		LocalDate dt = LocalDate.parse(s, DateTimeFormatter.ofPattern("dd-mm-yyyy"));
		DayOfWeek day = dt.getDayOfWeek();
		System.out.println(day);
cal.set(0, 0, 0);
	}

}
