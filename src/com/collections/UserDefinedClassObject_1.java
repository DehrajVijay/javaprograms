package com.collections;

import java.util.ArrayList;
import java.util.List;

class Book {
	String name, author, publisher;
	int id;
	int quantity;

	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;

	}
}

public class UserDefinedClassObject_1 {

	public static void main(String[] args) {
// Creating list of Books
		List<Book> lb = new ArrayList<Book>();

		Book b1 = new Book(101, "let us C", "Yashwant kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications and Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operation System", "Galvin", "Wiley", 6);

		// Adding Books to list
		lb.add(b1);
		lb.add(b2);
		lb.add(b3);
		
		/*
		 * Collections.sort(lb, Collections.reverseOrder());
		 * System.out.println(" Checking" + lb);
		 */
		// Traversing list
		
		  for (Book b : lb) { System.out.println(b.id + " " + b.name + " " + b.author +
		  " " + b.publisher + " " + b.quantity);
		  
		  }
		 
	}
}