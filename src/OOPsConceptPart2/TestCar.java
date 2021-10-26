package OOPsConceptPart2;

public class TestCar {
	// Inheritance : It is a mechanism in which one object acquires all the properties and behaviors of a parent object.
	// Overloading : If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
	// Overriding : If a child class provides the specific implementation of the method that has been declared by its parent class, it is known as method overriding.
	/* Polymorphism in Java is a concept by which we can perform a single action in different ways. Polymorphism is derived from 2 Greek words: poly and morphs. The word "poly" means many and "morphs" means forms. So polymorphism means many forms.
		There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism. We can perform polymorphism in java by method overloading and method overriding.
		If you overload a static method in Java, it is the example of compile time polymorphism.*/
	
	public static void main(String[] args) {
		
		// static or compile time polymorphism
		BMW b = new BMW();
		b.start();  //  Inheritance (Taken from Parent Class)
		b.stop();  //  Overriding (Taken from Child Class)
		b.theftSecutity();
		System.out.println("**************");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		System.out.println("**************");
		
		// Up casting/Top casting:If the reference variable of Parent class refers to the object of Child class, it is known as upcasting. For example:
		Car c1 = new BMW();
		c1.stop(); // dynamic or runtime polymorphism : an overridden method is called through the reference variable of a superclass/Parent class
		c1.refuel();
		System.out.println("**************");
		
		// Down casting
		BMW b1 = (BMW)c1; // child class reference variable refers to the parent class reference variable which is referring child class object. it is allowed
		c1.stop();;
		// BMW b2 = new Car(;) // if child class reference variable try to  refer the parent class object it throws an compile time error
		BMW b2 = (BMW) new Car();  //  if child class reference variable refers to the parent class object using down casting it throws an run time error : ClassCastException
		
		
		
	}

}
