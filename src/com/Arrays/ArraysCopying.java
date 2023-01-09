package com.Arrays;

import java.util.*;  
public class ArraysCopying {
	 
	    public static void main(String[] args) {  
	        //Create lists for source and destination      
	          List<String> srclist = new ArrayList<String>(5);  
	          List<String> destlist = new ArrayList<String>(10);  
	          //Populate two source and destination lists  
	          srclist.add("Java Tutorial");  
	          srclist.add("is");  
	          srclist.add("Available on");  
	          destlist.add("apnijava");  
	          destlist.add("by Vijay Dehraj");  
	          destlist.add("elevater");  
	          // copy into destination list  
	          Collections.copy(destlist, srclist);              
	          System.out.println("Elements of source list: "+srclist);  
	          System.out.println("Elements of destination list: "+destlist);  
	          }  
	}  
	

