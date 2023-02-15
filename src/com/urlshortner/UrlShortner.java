package com.urlshortner;

import java.io.IOException;

public class UrlShortner {
	static String idToshortURL(int n) {

		// Taking Map to store 62 possible chareacters.
		char map[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
		StringBuffer shorturl = new StringBuffer();

// convert given integer id to a base 62 character 
		while (n > 0) {

			// use above map to store actual character
			// in short url.
			shorturl.append(map[n % 62]);
			n = n / 62;
		}
		// Reverse shortURL to complete base conversion
		return shorturl.reverse().toString();
	}

	// This function to get integer ID back from a short url
	static int shortURLtoID(String shortURL) {
		// Initailizing the result;

		int id = 0;
		// somple base conversion logic

		for (int i = 0; i < shortURL.length(); i++) {
			if ('a' <= shortURL.charAt(i) && shortURL.charAt(i) <= 'z')
				id = id * 62 + shortURL.charAt(i) - 'a';
			if ('A' <= shortURL.charAt(i) && shortURL.charAt(i) <= 'Z')
				id = id * 62 + shortURL.charAt(i) - 'A' + 26;
			if ('0' <= shortURL.charAt(i) && shortURL.charAt(i) <= '9')
				id = id * 62 + shortURL.charAt(i) - '0' + 52;
		}
		return id;
	}

// The main method
	public static void main(String[] args) throws IOException {
		int n = 9898;
		String shorturl = idToshortURL(n);
		System.out.println("Generated short url is " + shorturl);
		System.out.println("Id from url is " + shortURLtoID(shorturl));

	}

}
