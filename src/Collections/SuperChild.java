package Collections;

public class SuperChild extends SuperParent {
	// super(); - super keyword is used to call the Parent class constructors
	// which are having Arguments / parameters
	// if we use super keyword the default constructor will not execute
	// super keyword is always written in child class constructor
	// it should be the 1st statement of that constructor
	// in one constructor we can't written morethan one super keyword
	// if we want to use morethan one super keyword then we have to create another
	// constructor

	public SuperChild() {
		super();
		System.out.println("child class constructor with no arguments");
	}

	public SuperChild(int i) {
		super(i);
		System.out.println("child class constructor with one arguments");
		System.out.println("i value is " + i);
	}

	public SuperChild(int i, int j) {
		super(i, j);
		System.out.println("child class constructor with two arguments");
		System.out.println("i value is " + i + " j value is " + j);
	}

	public static void main(String[] args) {
		SuperChild obj1 = new SuperChild(); // the moment we create child object, the default constructor of parent
											// class will call automatically if there is no "Super" keyword. then only
											// the child class constructor will be executed
		SuperChild obj2 = new SuperChild(100);
		SuperChild obj3 = new SuperChild(10, 20);

	}

}
