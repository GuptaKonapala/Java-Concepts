package AbstractionConcept;

public abstract class AbstractImplement { // Abstract class

	int amt = 10;
	final int rate = 100;
	static int percentage = 10;

	public AbstractImplement() {
		System.out.println("in the parent constructor");
	}

	public abstract void method();

	

	public void nonabstractmethod() { // non abstract method
		System.out.println("print");
	}

	

}
