package FinalConcept;

public class FinallyConcept {

	public static void main(String[] args) {
		test1();
	}
	public static void test1() {   //  finally is a block
		try {
			System.out.println("inside test1 method");
			//int i = 1/0;  //  it throws runtime error because 1/0 value is not possible
			throw new RuntimeException("test");  //  to throw an error manually. if there is an error above this code this won't execute
		}
		//catch (Exception e) {  //  to catch the error. if we didn't write this catch block it will throw an error. if there is no error in above code the code within the catch block will not be executed.
			//System.out.println("inside catch block");  // in place of "Exception e" if we mention particular Exception like "ArthimeticException e" or "NullPointerException e" to catch that particular errors 
		//}
		
		finally {  //  Even if there is an error in above method, the code within the finally block will be executed. it's always used with try block
			System.out.println("inside finally block");  
		}
	}
}
