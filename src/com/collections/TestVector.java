package com.collections;

import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		//Vector uses a dynamic array to store the data elements. It can store hetrogenous elements.
		
		Vector<Object> lv = new Vector<>();
		lv.add("Vijay");

		lv.add(5);
		lv.add(65.5);

		System.out.println(lv);
	}

}
