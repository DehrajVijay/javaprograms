package com.practice;

public class Test {

	public static void main(String[] args) {
		System.out.println("hello fresh start");
		String w_region = "w_region";
		String w_app_stage = "Waiver " + w_region + " Approval";
		//System.out.println(w_app_stage);
		String s_name = "Waiver w_region Approval";
		if (s_name.equals(w_app_stage)) {
			System.out.println("pass");
		} else {
			System.out.println("fail...");
		}
	}
}