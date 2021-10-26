package OOPConceptPart1;

public class MethodOverloading {
	/*we can't create method inside a method
	   we can't create duplicate methods i.e method with same name consists same no.of arguments with same data type*/
	//Method Overloading-- But we can create method with same name consists different no.of arguments or same name with different data type. it can applicable to main method also.
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.name();
	
		obj.name(65);
		obj.name("Mehta");
		obj.name(10, 15);
		obj.name(10, "Times");
	}
	private void name() {
	System.out.println("name method with no input arguments");
}
	private void name(int k) {
		System.out.println("name method with 1 input argument");
		System.out.println(k);
	}
	private void name(String f) {
		System.out.println("name method with 1 input argument but different data type");
		System.out.println(f);
	}
	private void name(int j, int o) {
		System.out.println("name method with 2 input arguments");
		System.out.println(j+o);
	}
	private void name(int l, String m) {
		System.out.println("name method with 2 different data type  input arguments");
		System.out.println(l+ " "+m);
	}
}
