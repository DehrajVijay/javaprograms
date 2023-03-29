package com.applications;

import java.io.IOException;
import java.util.Scanner;

public class ClassForCall {

	public static void ShowWeather() throws IOException, InterruptedException {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Weather forcasting");
		System.out.println("Press 1 for current Weather data.");
		System.out.println("Press 2 for Historic Weather data.");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Please Enter city name.");
			CallingMethods.dailyWeather(sc.next());
			break;

		case 2:
			System.out.println("Please add the the details as mentioned below.\na)Add start date as yyyy-mm-dd."
					+ "\nb)Add city name.\nc)Add end date as yyyy-mm-dd.");
			System.out.println("NOTE: History is available only for 30 days.");
			CallingMethods.historicReport(sc.next(), sc.next(), sc.next());

			break;
		default:
			System.out.println("Wrong Entry! Please try again.");
			break;
		}
		sc.close();
	}

}
