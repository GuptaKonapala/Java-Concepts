package OOPsConceptPart2;

public interface RBI {
	int minbal = 100;
	public void credit();
	public void debit();
	public void transferMoney();

	// only method declaration
	// no method body - only method prototype
	// in interface, we can declare the variables, variables are by default static in nature
	// variable value will not be changed, its final/constant in nature
	// no static method in interface  
	// no main method in interface
	// we cant create object of interface
	// interface is abstract in nature
}
