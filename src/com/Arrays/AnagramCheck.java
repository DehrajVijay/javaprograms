package com.Arrays;
import java.util.Arrays;
public class AnagramCheck {

	static void isAnagram(String str1,String str2) {
		//remove white spaces form  string str1
		String s1=str1.replaceAll("\\s","");
	//remove white spaces from string str2
	
	String s2=str2.replace("\\s", "");
	boolean status=true;
	//check if the length of the string are equal or not.
	if(s1.length()!=s2.length()) {
		status=false;
		
	}else {
		char[] arrayS1=s1.toLowerCase().toCharArray();
		char[] arrayS2=s2.toLowerCase().toCharArray();
		
		//sorting
Arrays.sort(arrayS1);
Arrays.sort(arrayS2);

//comparing the strings
status=Arrays.equals(arrayS1, arrayS2);
if(status) {

	System.out.println(s1+" and "+s2+" are Anagrams");
}else {
	System.out.println(s1+" and "+s2+" are not Anagrams");
}
	}}
	public static void main(String[] args) {
		
		isAnagram("HEART","EARTH");
		isAnagram("HEART","EARTHH");
		isAnagram("TRIANGLE","INTEGRAL");
		isAnagram("KAD","DAK");
		}
	}


