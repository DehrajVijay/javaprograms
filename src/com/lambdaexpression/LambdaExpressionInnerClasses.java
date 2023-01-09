package com.lambdaexpression;

public class LambdaExpressionInnerClasses {
	public static void main(String[] args) {
		LambdaExpressionInnerClasses c = new LambdaExpressionInnerClasses();
		c.go();

	}

	void go() {
		Bar b = new Bar();
		Foo f = () -> System.out.println("new Lambda foofy");
		b.doStuff(f);
	}
}

interface Foo {
	void foof();
}

class Bar {
	void doStuff(Foo f) {
		f.foof();
	};
}