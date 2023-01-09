package com.inheritance;

//creating class 'F'
class F {
	// creating a method m1();
	public void m1() {
		System.out.println("Father class");
	}
}

//creating 'C' which extends class 'F'
class C extends F {
	// creating a method m1();
	public void m2() {
		System.out.println("Child class");
	}
}

//creating main class 
public class GrandFather {
	public static void main(String[] args) {

		// creating Parent class object and reference is also of parent class.
		// On the parent reference we can call any method present in the parent class.
		F f1 = new F();
		// calling m1 method by parent reference.
		f1.m1();
		// we can not call child specific method even by the parent class reference.
		// It will lead to compilation error,because by default child specific
		// methods are not available to the parent class.
		// f1.m2();will lead to an error

		// creating Child object and child reference.

		C c1 = new C();
		// calling m1 method which is present in the parent class
		// by child reference which is perfectly valid.

		c1.m1();
		// calling m2 method which is present in child class by the child reference.
		c1.m2();
	
		F f2 = new C();
		f2.m1();
	//f2.m2(); compilation error
	
	C c1=new F();
	}

}
