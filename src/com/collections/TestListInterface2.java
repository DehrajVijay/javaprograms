package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class TestListInterface2 {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		// LinkedList uses a doubly linked list internally to store the elements.
		// It can store duplicate elements as well.
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Jasmine");
		ll.add("Rosa");
		System.out.println(ll);
		
		  Iterator<String> itr = ll.iterator(); 
		  while (itr.hasNext()) {
		  System.out.println(itr.next());
		  
		  }
		 
		for (String s : ll) {
			System.out.println(s);
		}
		System.out.println(ll.size());
	}

}
