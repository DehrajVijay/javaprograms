package com.lambdaexpression;

import java.util.function.*;

public class LambdaMultiThreading {

	public static void main(String[] args) {
		//already defined
		Runnable r = () -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("child Thread");
			}

		};
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println("Main Thread");
		}

	}
}
