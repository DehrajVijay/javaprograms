package p1;

public class Temp {

	int x = 10;

	void show() {
		System.out.println("show method from temp");
		System.out.println("x = " + x);

	}

	void out() {
		System.out.println("Out method from Temp");
	}

	public static void main(String...s) {
		Temp obj = new Temp();
		obj.show();
		obj.out();
	}

}
