package com.Arrays;

public class ArrayClassNames {

	public static void main(String[] args) {
		System.out.println(" class name for one dimension int type array");
		
		// class name for one dimension array
	
		int[] number = new int[5];
		System.out.println(number.getClass().getName());
		
		// class name of two dimension array
		
		int[][] numbers = new int[5][3];
		System.out.println(" class name for two dimension int type array");
		System.out.println(numbers.getClass().getName());

		// class name for double type array
		
		double[] dou = new double[5];
		System.out.println(" class name for one dimension double type array");
		System.out.println(dou.getClass().getName());

		// class name for short type array
		
		short[] shor = new short[7];
		System.out.println(" class name for one dimension short type array");
		System.out.println(shor.getClass().getName());

		// class name for byte type array

		byte[] bye = new byte[6];
		System.out.println(" class name for one dimension byte type array");
		System.out.println(bye.getClass().getName());

		// class name for boolean type of array

		boolean[] bool = new boolean[4];
		System.out.println(" class name for one dimension boolean type array");
		System.out.println(bool.getClass().getName());
	}

}
