package com.inheritance;

class Top {
	public Top() {
		System.out.println("The defalult constructor is invoked");
	}

	public Top(String s) {
		System.out.println("B");
	}
}

class Bottom2 extends Top {
	public Bottom2(String s) {
		System.out.println("D");
	}

	public static void main(String[] args) {
		new Bottom2("c");
		System.out.println(" ");
	}

}
