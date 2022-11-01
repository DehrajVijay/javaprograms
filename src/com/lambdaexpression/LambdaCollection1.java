package com.lambdaexpression;

import java.util.*;

class MyComp implements Comparator<Integer> {

	public int compare(Integer I1, Integer I2) {
		if (I1 < I2) {
			return -1;
		} else if (I1 > I2) {
			return +1;
		} else {
			return 0;
		}
	}
}

public class LambdaCollection1 {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(5);
		l.add(0);
		l.add(2);
		l.add(25);
		l.add(-11);
		System.out.println("we can get the output either by : Collections.sort(l,new MyComp());");
		Collections.sort(l,new MyComp());
		System.out.println(l);
		
		System.out.println("or by this : Collections.sort(l)");
		Collections.sort(l);
		System.out.println(l);
	}

}
