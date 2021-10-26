package basics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		/*Array - to store similar data type values in a array variable
		  lowest bound/index is 0
		  upper bound/index is n-1 (n is size of array)
		  one dimensional array 
		  advantage    - to store multiple values in single variable
		  disadvantage - size is fixed (Static array) -- to overcome we use collections like arraylist, hashtable. these are also called dynamic array
		  				 it stores similar data types only -- to overcome we use object array*/
		
		//1. int array
		int a[] = new int [4];
		  a [0] = 10;
		  a [1] = 20;
		  a [2] = 30;
		  a [3] = 40;
		  
		  System.out.println(a[3]);   // 40
		
		//System.out.println(a[4]);	  // ArrayIndexOutOfBoundsException
		  
		//2. double array
		  double d[]=new double [3];
		  		d[0]=1;
		  		d[1]=2;
		  		d[2]=3;
		  		
		  System.out.println(d[1]);    // 2.0
		  
		//3. character array
		  char e[]=new char [2];
		  	  e[0]='1';
		  	  e[1]='z';
		  		
		  System.out.println(e[1]);    // z
		  
		//4. boolean array
		  boolean f[]=new boolean [2];
		  	 	 f[0]=true;
		  		 f[1]=false;
		  		
		  System.out.println(f[0]);    // true
		  
		//5. String array
		  
		  String g[]=new String [3];
		  		g[0]="hey";
		  		g[1]="hi";
		  		g[2]="hello";
		  		
		  System.out.println(g[2]);    // hello
		  
		//6. Object array is a class. it is used to store different data type values
		  Object o[]=new Object[4];
		  		o[0]=100;
		  		o[1]=100;
		  		o[2]='S';
		  		o[3]="12/aug/21";
		  		
		  System.out.println(o[3]);    // 12/aug/21
		  
		//To print size of array
		  System.out.println(o.length);// 4
		    
		//To print all the values of array
		  for (int v=0;v<a.length;v++) {
		  System.out.println(a[v]);}   // 10 20 30 40
		  
		  System.out.println("*********"); // **********
		  
		  int y = 0;
		  while (y<a.length)
		  {System.out.println(a[y]);   // 10 20 30 40
		  y++;}
		  
		
		
	}

}
