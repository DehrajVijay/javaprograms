package com.practice;

public class InsufficientFundsException extends Exception {
	private double amountMissing;

	// Basic constructor

	public InsufficientFundsException(String message) {
		super(message);
	}

	// Advanced constructor to store how much money was missing
	public InsufficientFundsException(String message, double amountMissing) {
		super(message);
		this.amountMissing = amountMissing;
	}

	public double getAmountMissing() {
		return amountMissing;
	}

	@Override
	public String getMessage() {
		return "BANK ERROR: " + super.getMessage();

	}

}
