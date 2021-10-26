package array;

public class ArrayReverseOrder {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };

		System.out.println(array.length);

		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}


	}

}
