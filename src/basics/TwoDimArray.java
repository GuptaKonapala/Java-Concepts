package basics;

public class TwoDimArray {

	public static void main(String[] args) {
	
		// Two dimensional array
		Object a[][]=new Object [2][3];
		
		System.out.println(a.length);		// 2
	    System.out.println(a[0].length);	// 3
	    
	    // First row:
		     a[0][0]=30;
		     a[0][1]=40.97;
		     a[0][2]='M';
		     
		// Second row:
		     a[1][0]="Latin";
		     a[1][1]="area";
		     a[1][2]= 50;
		     
		System.out.println(a[0][2]);		// M
		
		// Print all the values of Two dimensional array
			 for(int row=0; row<a.length; row++) {
			 	for(int col=0; col<a[0].length; col++)
		System.out.println(a[row][col]);}
		     
		     
		
	}

}
