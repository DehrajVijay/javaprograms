package com.lambdaexpression;
import java.util.function.*;

interface Addition{
	public void add(int a,int b);
}



public class LambdaExpressionAdd {

	public static void main(String[] args) {
		
		Addition a1=(a,b)->System.out.println(a+b);
	a1.add(12, 20);
	a1.add(12, 12);
	}

}
