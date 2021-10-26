package Collections;

public class ConstructorConcept { //
	// it looks like a function but it's not
	// it can't return any value
	// constructor names should be same as a class name. but we don't write void or
	// data type and static or non static
	// There is always a hidden default Constructor

	public ConstructorConcept() {
		System.out.println("default Constructor");
	}

	public ConstructorConcept(int i) {
		System.out.println("single parameter constructor");
		System.out.println(i);
	}

	public ConstructorConcept(int i, int j) {
		System.out.println("two parameter constructor");
		System.out.println(i);
		System.out.println(j);
	}

	public static void main(String[] args) {
		ConstructorConcept c1 = new ConstructorConcept(); // Constructor will call automatically after creating object of that particular constructor
		ConstructorConcept c2 = new ConstructorConcept(10);
		ConstructorConcept c3 = new ConstructorConcept(100, 200);
	}

}
