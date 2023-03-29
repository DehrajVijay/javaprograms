package com.applications;

import java.util.Random;

public class OtpGeneratorByRandomMethod {
	public static String generateOtp(int otpLength) {
		StringBuilder sb = new StringBuilder();
		Random ram = new Random();
		for (int i = 0; i < otpLength; i++) {
			sb.append(sb);

		}
		return ram.toString();

	}

	public static void main(String[] args) {
		System.out.println(OtpGeneratorByRandomMethod.generateOtp(4));
	}

}
