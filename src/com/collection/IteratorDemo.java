package com.collection;
import java.util.*;

public class IteratorDemo {

	public static void main(String[] args) {
	ArrayList l=new ArrayList();
	for(int i=0;i<=10; i++) {
		l.add(i);
	}
System.out.println(l);
	
Iterator itr=l.iterator();
while(itr.hasNext()) {
	Integer I= (int)itr.next();
	if(I%2==0)
		System.out.println(I);
}
System.out.println(l);
	}
	}
