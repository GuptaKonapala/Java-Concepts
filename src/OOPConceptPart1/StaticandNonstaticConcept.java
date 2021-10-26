package OOPConceptPart1;

public class StaticandNonstaticConcept {
		static String word="room"; // static Global Variable
		String name="class"; // Non static Global Variable

	public static void main(String[] args) {
		// 1. how to call methods and Global Variables
		
		/* a. calling static Methods & Global Variables
		   There are 2 options to call static global variables*/
	   // 1.Direct calling
			method1();
		   System.out.println(word);
		   
		String example = "sample";
		word = example;
		
		// 2.Calling by class name
		StaticandNonstaticConcept.method1();
		System.out.println(StaticandNonstaticConcept.word);
		
		
		/* b. calling non static Methods & Global Variables
		    The only way to call the non static methods and variables is to create the object. then call with obj.method/variable*/
		StaticandNonstaticConcept obj=new StaticandNonstaticConcept();
		obj.method2();
		System.out.println(obj.name);
		
		
		/* 2. can we access static methods by using object reference? YES. but Warning will be given*/
		obj.method1(); 								// Warning
		System.out.println(obj.word); 		// Warning
		
	}
	public static void method1() {
		System.out.println("static method");
	}
	public void method2() {
		System.out.println("non static method");
	}
	}
