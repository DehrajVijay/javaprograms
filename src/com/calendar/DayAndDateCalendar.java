package com.calendar;

import java.util.Calendar;
import java.util.TimeZone;

public class DayAndDateCalendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("The Type of Calendar is : " + cal.getCalendarType());
		System.out.println("The Time zone is : " + cal.getTimeZone());
		System.out.println("The id of This Time zone is: " + cal.getTimeZone().getID());

		Calendar cal1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
		System.out.println(cal1.getTimeZone());
		System.out.println("The id of This Time zone is: " + cal1.getTimeZone().getID());
		System.out.println(cal.getWeeksInWeekYear());
		
	}

}
