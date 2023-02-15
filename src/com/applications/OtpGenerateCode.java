package com.applications;

// java 8 feature of SplittableRandom() method
// before this, Random was to do the same thing.
// The difference is random numbers will include 0 as well 
// but in SplittableRandom() we can provide the range.
import java.util.SplittableRandom;

public class OtpGenerateCode {

	public static String generateOtp(int otpLength) {
		SplittableRandom otp = new SplittableRandom();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < otpLength; i++) {
			sb.append(otp.nextInt(0, 10));
		}
		return sb.toString();

	}

	public static void main(String[] args) {
		System.out.print("The OTP is: ");
		System.out.println(OtpGenerateCode.generateOtp(6));
	}

}
