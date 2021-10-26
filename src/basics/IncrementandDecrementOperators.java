package basics;

public class IncrementandDecrementOperators {

	public static void main(String[] args) {

		/*++ Increment Operator
		  -- Decrement Operator*/
		
		int a = 1;
		int b = a++; // Post increment
		
		System.out.println(a);
		System.out.println(b);
		
		int c = 2;
		int d = ++c; // Pre increment
				
		System.out.println(c);
		System.out.println(d);
		
		int e = 2;
		int f = e--; // Post decrement 
				
		System.out.println(e);
		System.out.println(f);
		
		int g = 3;
		int h = --g; // Pre decrement
		
		System.out.println(g);
		System.out.println(h);
		
	}
}
