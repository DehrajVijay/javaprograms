package com.applications;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ApiCalling {
	public static void searchTrain(int trainnumber) throws IOException, InterruptedException {

		String url = "https://irctc1.p.rapidapi.com/api/v1/searchTrain?query=" + trainnumber;
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url))
				.header("X-RapidAPI-Key", "bc8ad96066msh8ec92c436f58b18p158c56jsn1ee72ef31452")
				.header("X-RapidAPI-Host", "irctc1.p.rapidapi.com").method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
	}

	public static void SearchStation(String stationname) throws IOException, InterruptedException {
		String url = "https://irctc1.p.rapidapi.com/api/v1/searchStation?query=" + stationname;
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url))

				.header("X-RapidAPI-Key", "bc8ad96066msh8ec92c436f58b18p158c56jsn1ee72ef31452")
				.header("X-RapidAPI-Host", "irctc1.p.rapidapi.com").method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());

	}
				
	public static void TrainsBetweenStation(String from, String to) throws IOException, InterruptedException {
		String url = "https://irctc1.p.rapidapi.com/api/v2/trainBetweenStations?fromStationCode="+from+"&toStationCode="+to;
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url))
				.header("X-RapidAPI-Key", "bc8ad96066msh8ec92c436f58b18p158c56jsn1ee72ef31452")
				.header("X-RapidAPI-Host", "irctc1.p.rapidapi.com").method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("Enter the train number."); int trainnumber =
		 * sc.nextInt(); searchTrain(trainnumber);
		 * 
		 * 
		 * System.out.println("Enter the station name to check the station details.");
		 * String stationname = sc.nextLine(); SearchStation(stationname);
		 */
		System.out.println("From");
		String from = sc.nextLine();
		System.out.println("To");
		String to = sc.nextLine();
		TrainsBetweenStation(from, to);
	}
}