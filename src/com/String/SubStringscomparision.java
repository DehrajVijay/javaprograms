package com.String;

public class SubStringscomparision {

	public static void main(String[] args) {
		int temp;
		String s = "apnijavabyvijaydehraj";
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (ch[i] > ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = (char) temp;
				}
			}
			 System.out.println(s.substring(0, 3));
		}
		

		}
	//System.out.println();
	}

