package OOPsConceptPart2;

public class SBI implements RBI, SEBI { // we are achieving multiple inheritance
	// is - a relationship
	// if a class is implementing any Interface, then its mandatory to define / override all the methods of Interface

	// overriding from RBI Interface
	public void credit() {
		System.out.println("sbi credit");
	}

	public void debit() {
		System.out.println("sbi dedit");
	}

	public void transferMoney() {
		System.out.println("sbi transferMoney");
	}
	// SBI Own method
	public void loan() {
		System.out.println("sbi loan");
	}
	// overriding from SEBI 
	public void mutualfund() {
		System.out.println("Mutualfund");
	}
		



}
