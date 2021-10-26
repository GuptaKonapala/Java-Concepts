package Collections;

public class SuperParent {

	public SuperParent() { // to call this constructor we have to create a object in child class (not
							// necessary to create a constructor) and don't use super keyword in child class
							// constructor
		System.out.println("parent class constructor");
	}

	public SuperParent(int i) { // to call this one argument constructor we have to create a new constructor in
								// child class then use super keyword in that constructor
		System.out.println("Parent class one argument constructor");
	}

	public SuperParent(int i, int j) { // to call this two argument constructor we have to create another constructor
										// in child class then use super keyword in that constructor
		System.out.println("Parent class two argument constructor");
	}
}
