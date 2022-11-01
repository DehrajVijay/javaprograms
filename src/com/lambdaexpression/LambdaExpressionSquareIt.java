package com.lambdaexpression;

import java.util.function.*;

interface FunInterface1 {
	public int squareIt(int n);

}

public class LambdaExpressionSquareIt {

	public static void main(String[] args) {
		FunInterface1 fun1 = n->{return n*n;};
		System.out.println(fun1.squareIt(15));

	}

}
