package com.applications;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class OtpVerificationPhoneNumbers {

	public static void sendOTP(String mobnumber) throws IOException, InterruptedException {
		String url = "https://wipple-sms-verify-otp.p.rapidapi.com/send=" + mobnumber;
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url))

				.uri(URI.create("https://wipple-sms-verify-otp.p.rapidapi.com/send"))
				.header("content-type", "application/json")
				.header("X-RapidAPI-Key", "bc8ad96066msh8ec92c436f58b18p158c56jsn1ee72ef31452")
				.header("X-RapidAPI-Host", "wipple-sms-verify-otp.p.rapidapi.com")
				.method("POST", HttpRequest.BodyPublishers.ofString(
						"{\r\n    \"Vijay_Dehraj's app\": \"exampleapp\",\r\n    \"code_length\": 6,\r\n    \"code_type\": \"number\",\r\n    \"expiration_second\": 86000,\r\n  "
						+ "  \"phone_number\": \"mobnumber\"\r\n}"))
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
	}

	public static void verifyOTP(String mobnumber) throws IOException, InterruptedException {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://wipple-sms-verify-otp.p.rapidapi.com/send"))
				.header("content-type", "application/json")
				.header("X-RapidAPI-Key", "bc8ad96066msh8ec92c436f58b18p158c56jsn1ee72ef31452")
				.header("X-RapidAPI-Host", "wipple-sms-verify-otp.p.rapidapi.com")
				.method("POST", HttpRequest.BodyPublishers.ofString("{\r\n    \"app_name\": \"exampleapp\",\r\n   "
						+ " \"code_length\": 5,\r\n    \"code_type\": \"number\",\r\n    \"expiration_second\": 86000,\r\n    \"phone_number\": \"number\"\r\n}"))
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mobile number with country codes.");

		sendOTP(sc.next());

		/*
		 * System.out.println("Enter the OTP"); verifyOTP(sc.next());
		 */
	}
}