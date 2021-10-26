package OOPConceptPart1;

public class NonStaticMethodsFunctionsinJava {

	public static void main(String[] args) {

	NonStaticMethodsFunctionsinJava b = new NonStaticMethodsFunctionsinJava();
	/* one object will be created, b is the reference variable referring to this object
	   once we creating the object, the copy of all non static methods will be given to this object*/
	
	b.xyz();
	
	int a = b.pqr();
	System.out.println(a);
	
	int r = b.mno(100, 50);
	System.out.println(r);
	
	//main method is void because never returns a value
	
	}

	/* non static methods
	   void does not return any value
	   return type = void*/
	
	public void xyz() { // no input, no output
	System.out.println('x');
	}
	
	//return type int
	public int pqr() {  // no input, some output
		int e= 10;
		int d= 20;
		int c= (e+d)/2*10;
	System.out.println(c+d+e);	
		return c;
	}
	
	//return type int
	//k,l are the input parametres/arguments
	public int mno(int k, int l) { //some input, some output
		System.out.println(k-l);
		int p = k/l;
		return p;
	}
	
	
}