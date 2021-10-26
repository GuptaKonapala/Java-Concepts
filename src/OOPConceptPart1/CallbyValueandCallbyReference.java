package OOPConceptPart1;

public class CallbyValueandCallbyReference {
		int p;
		int q;
	public static void main(String[] args) {												// We can call non static methods by using Value or Reference
		CallbyValueandCallbyReference obj = new CallbyValueandCallbyReference();
		int x = 10;
		int y = 20;
		System.out.println(obj.testsum1(x, y));											// Call by Value or Pass by Value
		
		obj.p = 100;
		obj.q = 200;
		System.out.println(obj.testsum2(obj)); 											// Call by Reference
	}
	 public int testsum1(int a, int b) { 														// Call by Value or Pass by Value 
		 int c = a+b;
		 return c;
	}
	 public int testsum2(CallbyValueandCallbyReference f) { 				// Call by Reference
		 int r = f.p+f.q;
		 return r;
		 
		
	}

}
