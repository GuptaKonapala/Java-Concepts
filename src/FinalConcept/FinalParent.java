package FinalConcept;
 // final is a keyword
public class FinalParent { // using final keyword before class it doesn't allow to create a child class - to prevent inheritance

	// 1. final is a keyword
	// 2. it's used to write constant values(the values doesn't change)
	// 3. to prevent Inheritance
	// 4. to prevent Overriding
	
	public static void main(String[] args) {
		int i = 10;
		i = 20;	
		i = 30;  // we can change i value n number of times
		System.out.println(i);
		
		 final int j = 10; // constant values - if we using "final" keyword that particular value can't be changed. 
		//  j = 20;  
		 System.out.println(j);
		 
		 
	}
	public static void method() { // using final keyword before void it doesn't allow overriding - to prevent method overriding
		System.out.println("Final Class is a Parent Class");
	}
}
