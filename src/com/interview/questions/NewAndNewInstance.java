package com.interview.questions;

public class NewAndNewInstance {

	public static void main(String[] args) throws Exception {

		Object o = Class.forName(args[0]).newInstance();
		System.out.println(o.getClass().getName());
	// newInstance() method doesn't take any argument.(no args method.)	
	}
}
