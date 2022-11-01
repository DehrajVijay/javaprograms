package com.lambdaexpression;

import java.util.function.*;

interface FuncInterface {
	void abstractFun(int x);

	// a non-abstract or default function
	default void normalFun() {
		System.out.println("HEllo lambda expression");
	}
}

public class LambdaExpressionDemo {

	public static void main(String[] args) {

		// lambda expression
		FuncInterface fobj = (int x) -> System.out.println(2 * x);
		fobj.abstractFun(5);
		fobj.normalFun();
	}

}