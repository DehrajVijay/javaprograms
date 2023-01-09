package com.ArithmeticOperations;

import java.util.Scanner;

public class MathSeries {

	public static void main(String[] args) {
		 int a=0;
	      int b=0; 
	      int n=0;
	        Scanner in = new Scanner(System.in);
	       System.out.println("enter t value");
	        int t=in.nextInt();
	        System.out.println("enter a,b,c value");
	      
	        for(int i=0;i<t;i++){
	             a = in.nextInt();
	             b = in.nextInt();
	             n = in.nextInt();
	             int s=a;
	      for(int j=0; j<n; j++){
	          int x=(int)Math.pow(2,j);
	          s+=(x*b);
	             System.out.print(s+" ");
	      }
	     System.out.println();
	        }
	        in.close();

	}

}
