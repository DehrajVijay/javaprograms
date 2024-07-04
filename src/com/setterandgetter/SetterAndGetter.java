package com.setterandgetter;

import java.util.ArrayList;
import java.util.List;

public class SetterAndGetter {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		List<Object> arr = new ArrayList<>();
		arr.add("USD");
		arr.add("AUS");
		arr.add("EUR");
		arr.add("USD");
		arr.add("SSD");
		System.out.println(arr);
		//String curr=(String) arr.get(1);
		//System.out.println(curr);
	// String newCurr=(String) arr.set(2, curr);
		//System.out.println(arr);
		try {
			
			String curr = null;
			String newCurr;
			for(int i=1; i<arr.size()-1; i++) {
				curr=(String) arr.get(i);
				newCurr=(String) arr.set(i+1, curr);
				
			}
			System.out.println(arr);
		}
		catch(Exception e){
			System.out.println("handled...");
			System.out.println(e);
			
		}
		//System.out.println(curr);
		
		
	}

}
