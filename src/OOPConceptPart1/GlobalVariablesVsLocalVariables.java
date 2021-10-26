package OOPConceptPart1;

public class GlobalVariablesVsLocalVariables {
	String name="Harsha"; // These are the Non static Class variables or Non static Global Variables. Access these Variables throughout Program
	int age=27;
	Object DOY=1995;
	static String word="alphabet"; // This is the static Global Variable
			
	public static void main(String[] args) { // This is the static void method
		String name="Ashwin"; // These are the Local Variables for main method. Only Access with in this method
		int age= 23;
		Object DOY=1999;
		
		System.out.println(name);
		System.out.println(word); // We can call static Global Variables directly
		GlobalVariablesVsLocalVariables obj  = new GlobalVariablesVsLocalVariables(); // We have to create a object to call Non Static Global Variables & Non static methods
		System.out.println(obj.name);
		obj.example();
	}
	public void example() { // This is the Non static void method
		String name="Koushik"; // These are the Local Variables for example method
		int age=20;
		Object DOY=2001;
		System.out.println(name);
	}

}
