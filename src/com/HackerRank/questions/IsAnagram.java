package com.HackerRank.questions;

import java.util.Scanner;

public class IsAnagram {

	static boolean isAnagram(String a, String b) {
        // If the lengths of the strings are not the same, they cannot be anagrams
        if (a.length() != b.length()) {
            return false;
        }

        // Convert both strings to lowercase to ensure the comparison is case-insensitive
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Convert strings to character arrays
        char[] charArrayA = a.toCharArray();
        char[] charArrayB = b.toCharArray();

        // Sort the character arrays
        java.util.Arrays.sort(charArrayA);
        java.util.Arrays.sort(charArrayB);

        // Compare the sorted arrays
        return java.util.Arrays.equals(charArrayA, charArrayB);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
