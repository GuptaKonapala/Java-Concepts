package basics;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//print numbers from -10 to 10
		
		int a = -10; 					// initialization part
		
		/* 1. while loop
		disadvantage is it will generate infinite loop if you dont give incremental or decremental part*/
		while (a<11) 					// conditional part
		{System.out.println(a);
		a++;		 					// incremental or decremental part
		}
		
		// 2. for loop
		for (int b = -10; b<11; b++)
			System.out.println(b);
		
		//print numbers from 10 to 1 (decremental order)
		for (int c = 10; c>0; c--)
			System.out.println(c);
			
	}

}
