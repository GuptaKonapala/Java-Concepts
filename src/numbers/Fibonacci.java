package numbers;

public class Fibonacci {

	public static void main(String[] args) {
		// fibonacci series
		int  num=13;
		int num1 = 0;
		int num2 = 1;
		for (int i = 0; i < num; i++) {

			System.out.print(num1 + " "); // 0 1
			int num3 = num1 + num2; //  1  2 
			num1 = num2;  // 1   1
			num2 = num3; // 1   2
		}
	}

}
