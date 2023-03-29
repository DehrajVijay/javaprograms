package com.applications;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class UrlShortener {

	// method to cut short the long url.
	public static void shorturl(String url) throws IOException, InterruptedException {

		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://url-shortener-service.p.rapidapi.com/shorten"))
				.header("content-type", "application/x-www-form-urlencoded")
				.header("X-RapidAPI-Key", "bc8ad96066msh8ec92c436f58b18p158c56jsn1ee72ef31452")
				.header("X-RapidAPI-Host", "url-shortener-service.p.rapidapi.com")
				.method("POST", HttpRequest.BodyPublishers.ofString("url="+url)).build(); // method takes url in String format.
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());

	}

	public static void main(String[] args) throws IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please paste your url to make it short.");
		shorturl(br.readLine());
	}

}
