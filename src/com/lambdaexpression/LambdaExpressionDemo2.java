package com.lambdaexpression;

import java.util.function.*;

interface  FunInter{
	public void abstractFun();

}

public class LambdaExpressionDemo2 {

	public static void main(String[] args) {
		FunInter fi = () -> System.out.println("HEllo Lambda first body");
		fi.abstractFun();

	}

}
