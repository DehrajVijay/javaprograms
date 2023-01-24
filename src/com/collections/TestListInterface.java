package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListInterface {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Ravi");
		l.add("Vijay");
		l.add("Jasmine");
		l.add("Rosa");
		
		System.out.println(l);
		System.out.println(l.contains("Jasmine"));
		l.add(1, "Deepa");
		l.get(4);
		//testing 
		System.out.println(l.getClass());
		System.out.println(l.isEmpty());
		System.out.println(l.size());
		System.out.println(l.toString());
		System.out.println(l.toArray());
		

		// Traversing list through Iterator
		System.out.println("Output after the use of Iterator");
		Iterator<String> itr = l.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	

}
