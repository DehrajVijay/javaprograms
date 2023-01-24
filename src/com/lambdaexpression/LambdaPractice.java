package com.lambdaexpression;

@FunctionalInterface
interface calcus {
	void cal(int num);

	default void normfun() {
		System.out.println("This is the normal functional in the functional interface");
	}
}

public class LambdaPractice {

	public static void main(String[] args) {
		// Method Calling
		calcus c = n -> {
			
			
		};
//pass param to abstract method print
		c.cal(1);
		c.normfun();
	}
}