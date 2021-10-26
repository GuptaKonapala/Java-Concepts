package basics;

public class IfelseConcept {

	public static void main(String[] args) {
		
		/* comparision operators:
		   < > <= >= == !=
		 */
		
		int a = 10;
		int b = 20;
		
		if (a<b) {System.out.println("a is smaller than b");}				// condition true print
		else {System.out.println("b is smaller than a");}
		
		int c = 30;
		int d = 40;
		
		if (c==d) {System.out.println("c is equal to d");}					// condition false
		else {System.out.println("c is not equal to d");					// Print
		
		// write a logic to find out the highest number
		
		int x = 50;
		int y = 40;
		double z = 100;
		int w = 200;
		
		//nested if else (for more than 2 comparisions)
		
		if (x<y&y>z&w<y) {System.out.println("y is the highest number");}	// condition false
		else if (x<z&z>w) {System.out.println("z is the highest number");}	// condition false
		else if (x>w){System.out.println("x is the highest number");}		// condition false
		else {System.out.println("w is the highest number");				// Print
		
		}
		}
	}

}
