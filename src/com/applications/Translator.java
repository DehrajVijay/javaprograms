package com.applications;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Translator {
// This method will provide a list of languages supported by the API.
	public static void selectLanguages() throws IOException, InterruptedException {

		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://google-translate1.p.rapidapi.com/language/translate/v2/languages?target=en"))
				.header("Accept-Encoding", "application/gzip")
				.header("X-RapidAPI-Key", "bc8ad96066msh8ec92c436f58b18p158c56jsn1ee72ef31452")
				.header("X-RapidAPI-Host", "google-translate1.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody()).build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());

	}

// This method takes two parameteres, 1st the language code from the above list and second the text to be translated.
	
	public static void translate(String inputlanguage, String text) throws IOException, InterruptedException {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://google-translate1.p.rapidapi.com/language/translate/v2"))
				.header("content-type", "application/x-www-form-urlencoded")
				.header("Accept-Encoding", "application/gzip")
				.header("X-RapidAPI-Key", "bc8ad96066msh8ec92c436f58b18p158c56jsn1ee72ef31452")
				.header("X-RapidAPI-Host", "google-translate1.p.rapidapi.com")
				.method("POST",
						HttpRequest.BodyPublishers.ofString("q=" + text + "&target=" + inputlanguage + "&source=en"))
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the languages to translate the text into.");
		
		// method calling for the list of languages supported by the API.
		selectLanguages();
	
		System.out.println("type the language code from the above list and type your text.");
	
		// method calling to translate the text.
		translate(sc.nextLine(), sc.nextLine());
	}  

}
