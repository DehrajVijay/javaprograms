package com.applications;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CallingMethods {

	// method for daily weather reports takes two strin parameters as city and
	// country.
	public static void dailyWeather(String city) throws IOException, InterruptedException {

		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://visual-crossing-weather.p.rapidapi.com/forecast?aggregateHours=24&location="
						+ city + "&contentType=csv&unitGroup=us&shortColumnNames=0"))
				.header("X-RapidAPI-Key", "bc8ad96066msh8ec92c436f58b18p158c56jsn1ee72ef31452")
				.header("X-RapidAPI-Host", "visual-crossing-weather.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody()).build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
	}

	// mehod for historic weather report.
	public static void historicReport(String startDate, String city, String endDate)
			throws IOException, InterruptedException {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://visual-crossing-weather.p.rapidapi.com/history?startDateTime=" + startDate
						+ "&aggregateHours=24&location=" + city + "&endDateTime=" + endDate
						+ "&unitGroup=us&dayStartTime=8%3A00%3A00&contentType=csv&dayEndTime=17%3A00%3A00&shortColumnNames=0"))
				.header("X-RapidAPI-Key", "bc8ad96066msh8ec92c436f58b18p158c56jsn1ee72ef31452")
				.header("X-RapidAPI-Host", "visual-crossing-weather.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody()).build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
	}
}
