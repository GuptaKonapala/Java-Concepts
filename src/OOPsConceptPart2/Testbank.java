package OOPsConceptPart2;

public class Testbank {

	public static void main(String[] args) {
		System.out.println(RBI.minbal); // calling by Interface name
		System.out.println(SBI.minbal); // calling by class name
		SBI s = new SBI();
		s.credit();
		s.debit();
		s.transferMoney();
		s.loan();
		s.mutualfund();
		
		// dynamic polymorphism
		// child class object can be referred by parent Interface reference variable
		RBI r = new SBI ();
		r.credit();
		r.debit();
		r.transferMoney();
		
		SEBI sb = new SBI();
		sb.mutualfund();
	}

}
