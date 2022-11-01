package com.lambdaexpression;

import java.util.function.*;

interface Multiply {
	public void mul(int a, int b, int c);
}

public class LambdaExpressionHello {

	public static void main(String[] args) {

		Multiply m1 = (a, b, c) -> System.out.println(a * b * c);
		Multiply m2= (a, b, c) -> System.out.println(a +b +c);

		m1.mul(10,12,-2);
		m2.mul(10, 12, -5);

	}
}