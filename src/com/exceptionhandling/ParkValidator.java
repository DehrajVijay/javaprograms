package com.exceptionhandling;

import java.util.Scanner;

public class ParkValidator {

    // Logic for ride eligibility
    public static void checkRideEligibility(int age) throws InvalidAgeException {
        if (age < 6) {
            throw new InvalidAgeException("Visitors under 6 are too young for the park.", age);
        } else if (age < 18) {
            throw new InvalidAgeException("You can visit the park, but you are too young for rides.", age);
        }
        System.out.println("Eligibility confirmed: You can take any ride!");
    }

    public static void main(String[] args) {
        // Use try-with-resources to automatically close the Scanner/Reader
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Please enter your age: ");
            
            // Validate that the input is actually a number
            if (!sc.hasNextInt()) {
                System.out.println("Error: Please enter a valid numerical age.");
                return;
            }

            int age = sc.nextInt();
            checkRideEligibility(age);

        } catch (InvalidAgeException e) {
            // Handle custom business logic errors
            System.out.println("Access Denied: " + e.getMessage());
            System.out.println("Age provided: " + e.getAge());
        } catch (Exception e) {
            // Handle unexpected runtime errors (like input issues)
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
