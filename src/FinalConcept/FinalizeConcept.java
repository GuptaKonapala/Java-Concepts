package FinalConcept;

public class FinalizeConcept {
	
	public void finalize() { //  Finalize is method, it will run automatically to cleanup processes before garbage collector runs
		System.out.println("finalize method"); 
	}
	public static void main(String[] args) {
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
				f1 = null;
				f2 = null;
				System.gc();  // to call garbage collector manually
	}
	
}
