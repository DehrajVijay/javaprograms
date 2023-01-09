package com.regularexpression;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// This Program is to read the 'MOBILE NUMBERS' only from a text file containing multiple information.
public class CopyMobileNumbers {

	// Throwing exception as PrintWriter throws 'FileNotFoundException' and
	// BufferedReader throws 'IOException'
	public static void main(String[] args) throws FileNotFoundException, IOException {
		/*
		 * //To use regular expression, here I am using Pattern class object in which
		 * defining the expression for the valid mobile number.
		 */

		Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");

		/*
		 * Using PrintWriter class object to create a (.txt) file with the name
		 * MobileNumbers.txt and copying the mobile numbers to it.
		 */
		PrintWriter pw = new PrintWriter("MobileNumbers.txt");

		/*
		 * To read the lines from file, best is to use BufferedReder class. It will read
		 * the (.txt) files. I want to read the 'Myinfo.txt' file which is present in my
		 * system. if this is not present it will throw an exception
		 * "FileNotFoundException"
		 */
		BufferedReader br = new BufferedReader(new FileReader("Myinfo.txt"));
		String line = br.readLine();
		// using while loop to check if the file is empty or not.
		while (line != null) {
			// using Matcher class to match the regular expression
			Matcher m = p.matcher(line);
			while (m.find()) {
				// If it finds the match, it will copy the matches using the PrintWriter object
				// 'pw'
				pw.println(m.group());
			}

			line = br.readLine();

		}
		pw.flush();
		pw.close();
		br.close();
	}
}
