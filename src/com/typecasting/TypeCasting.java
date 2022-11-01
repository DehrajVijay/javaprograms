package com.typecasting;

public class TypeCasting {

	public static void main(String[] args) {

		class A {
			public static void m1() {
				System.out.println("Class A method");
			}
		}
		class B extends A {
			public void m1() {
				System.out.println("Class B method");
			}
		}
		class C extends B {
			public void m1() {
				System.out.println("Class C method");
			}
		}
		// respective methods will be called because in static method
		// overriding, and this is the concept of method hiding and
		// method resolution takes care by compiler based on reference.

		C c1 = new C();
		c1.m1();
		((B) c1).m1();// final reference is B
		((A) (((B) c1))).m1();// final reference is A
	}

}
