package com.regularexpression;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversionStringToDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Enter the pcAmount"); String PcAmountActual =
		 * sc.nextLine();
		 * 
		 * if (PcAmountActual.contains("E")) { String extracted =
		 * PcAmountActual.substring(PcAmountActual.indexOf('|') + 1);
		 * 
		 * System.out.println(extracted); try { BigDecimal bigDecimalValue = new
		 * BigDecimal(extracted); long longValue = bigDecimalValue.longValueExact(); //
		 * Convert BigDecimal to long
		 * 
		 * // Formatting with two decimal places DecimalFormat df = new
		 * DecimalFormat("0.00"); String formattedValue = df.format(longValue);
		 * 
		 * // double decValue=bigDecimalValue.floatValue();
		 * System.out.println("Parsed long value: " + formattedValue); } catch
		 * (NumberFormatException | ArithmeticException e) {
		 * System.err.println("Error parsing long value: " + e.getMessage()); } } else {
		 * System.out.println(PcAmountActual); }
		 */
		String ctry = "JPY";
		String value = "28125000";
		String amount = value + ctry ;
		System.out.println(amount);

	}
}