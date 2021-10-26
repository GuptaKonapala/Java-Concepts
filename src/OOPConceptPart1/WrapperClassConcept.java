package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
// data conversion String to Other data types and vise versa

// from String to Integer
String s = "100";
System.out.println(s+100);										// String + Interger
System.out.println(Integer.parseInt(s)+100);			// by using class (Interger.parseInt)String converted into Integer + Interger. (return type is primitive data type)

System.out.println(Integer.valueOf(s)+200);			// return type is Integer class
		
// from String to double
String x="50.98";
double z = Double.parseDouble(x);
System.out.println(z+12.02);

// from String to boolean
String y = "true";
boolean k = Boolean.parseBoolean(y);
System.out.println(k);

// from any data type to String
int a = 1;
double b = 2;
char c = 'c';
boolean d = false;
System.out.println(a+1);
System.out.println(String.valueOf(a)+1);
System.out.println(b+2);
System.out.println(String.valueOf(b)+2);

//from String to int
String u = "100abc";
int w=Integer.parseInt(u);											// showing error : Number Format Exception : For Input string : 100abc
	}

}
