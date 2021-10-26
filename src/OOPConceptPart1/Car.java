package OOPConceptPart1;

public class Car {

	//Class Variables or Global Variables
		int mod;
		int wheel;
	
	public static void main(String[] args) {
		
	/*new Car(); is the object of Car class
	  new keyword is used to create the object
	  a,b,c are the object reference variables*/
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
				
		a.mod  = 2020;
		a.wheel= 4;
		
		b.mod  = 2019;
		b.wheel= 4;
		
		c.mod  = 2018;
		c.wheel= 4;
		
		System.out.println(a.mod); // 2020
		System.out.println(b.mod); // 2019
		System.out.println(c.mod); // 2018
		
		a=b;
		b=c;
		c=a;
		
		System.out.println("After shifting the references");
		
		System.out.println(a.mod); // 2019
		System.out.println(b.mod); // 2018
		System.out.println(c.mod); // 2019
	}

}
