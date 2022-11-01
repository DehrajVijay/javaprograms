
public class ArrayTriplet {

	public static void main(String[] args) {
		int[] array = { 3, 4, 5 };
		System.out.println("The elements are: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}
		if ((array[0] * array[0]) + (array[1] * array[1]) == (array[2]) * (array[2])) {
			System.out.println("Yes this is a triplet");
		} else {	
			System.out.println("This is not a triplet");
			
		}
	}
}