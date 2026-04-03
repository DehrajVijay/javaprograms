package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdventureParkApp {

	// STEP 1: Deep Logic - Throws the exception
	public static void validateAge(int age) throws InvalidAgeException {
		if (age <= 0 || age > 130) {

			throw new InvalidAgeException("Please enter a realistic age", age);
		} else if (age < 6) {

			throw new InvalidAgeException("Too young for the park!", age);

		} else if (age < 18) {

			throw new InvalidAgeException("Too young for the Mega-Drop!", age);
		}
		System.out.println("Age validated: " + age);
	}

	// STEP 2: Middle Layer - It doesn't handle the error!
	// It just says "If an error happens here, I'm passing it up the chain."
	public static void processBooking(int age) throws InvalidAgeException {
		validateAge(age); // If this fails, the code below NEVER runs
		System.out.println("Step 2: Payment processed.");
		System.out.println("Step 3: Ticket printed.");
	}

	// STEP 3: The Entry Point - The only place that actually "Catches" it
	public static void main(String[] args) throws InvalidAgeException {
		System.out.println("--- Welcome to the Booking System ---");

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter the age");
			int age = sc.nextInt();
			processBooking(age);
			System.out.println("Booking Successful!");

		} catch (InputMismatchException e) {

			System.out.println("STOP: Invalid input! Please enter a whole number (e.g., 25).");

		} catch (InvalidAgeException e) {

			// The error "Bubbled up" from Step 1 to here!
			System.out.println("STOP: Booking failed because: " + e.getMessage());
			System.out.println("Log: User tried to enter with age " + e.getAge());
		} catch (Exception e) {
			System.out.println("An unexpected error occurred: " + e.getMessage());
		}
		System.out.println("--- System remains running for the next customer ---");
	}
}
