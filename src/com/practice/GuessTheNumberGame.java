package com.practice;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess, userGuess;
        int attempts;

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I will think of a number between 1 and 10.");
        System.out.println("Your job is to guess what it is!");

        // Game loop
        while (true) {
            numberToGuess = random.nextInt(10) + 1;  // Generates a random number between 1 and 10
            attempts = 0;

            // Ask the user to guess until they are correct
            do {
                System.out.print("Enter your guess (1 to 10): ");
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number: " + numberToGuess);
                    System.out.println("It took you " + attempts + " attempts.");
                }

            } while (userGuess != numberToGuess);  // Keep going until the guess is correct

            // Ask if the user wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                System.out.println("Thank you for playing! Goodbye!");
                break;
            }
        }

        scanner.close();
    }
}
