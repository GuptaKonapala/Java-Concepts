package Collections;

public class ConstructorwithThiskeyword {

	String name;
	int years;

	public ConstructorwithThiskeyword(String name, int age) {
		this.name = name; // if global and local variables are same, then we use "this" keyword to call
							// the global varialbe
		years = age; // if not same then we can call global variables directly
		System.out.println(name + " age  " + age);
	}

	public static void main(String[] args) {
		ConstructorwithThiskeyword obj = new ConstructorwithThiskeyword("tom", 30);
	}

}
