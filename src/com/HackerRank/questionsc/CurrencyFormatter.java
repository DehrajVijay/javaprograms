package com.HackerRank.questionsc;

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.*;

public class CurrencyFormatter {

	public static void main(String[] args) {
		System.out.println("Enter the amount");
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();
// Using NumberFormat class and by that calling the getCurrencyInstance method to format the symbol for currency.
		String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		// India does not have built in getCurrencyInstance so I am creating a Locale for India. which takes two parameters "language" and "country".
		String india = NumberFormat.getCurrencyInstance(new Locale("EN", "IN")).format(payment);
		String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);

	}

}
