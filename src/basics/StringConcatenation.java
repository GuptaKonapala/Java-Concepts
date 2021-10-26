package basics;

public class StringConcatenation {

	public static void main(String[] args) {
	
		//+ is concatenation operator
		// println - is used to print on the console with a new line
		// print -  is used to print on the console
		
		int a = 1000;
		int b = 500;
		
		String x = "Hey";
		String y = "mister";
		
		String c = "50";
		String d = "150";
		
		System.out.println(a+b); 									// 1500
		System.out.println(c+d); 									// 50150
		System.out.println(x+y); 									// Heymister
		System.out.println(x+' '+y);								// Hey mister
		System.out.println("Value of a is : "+a);					// Value of a is : 1000
		System.out.println("Multiplication of a and b is "+(a*b));	// Multiplication of a and b is 500000

	}

}
