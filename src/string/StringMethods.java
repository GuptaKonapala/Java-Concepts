package string;

import org.testng.annotations.Test;

public class StringMethods {
	
	String name;
	String name2;
	String name3;
	
	@Test
	public void methodsInString() {
		name = "Gupta Konapala";
		name2 = "gupta konapala";
		name3 = "         space         ";
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf("p"));
		System.out.println(name.indexOf("p", name.indexOf("p")+1));
		System.out.println(name.indexOf("Ko"));
		System.out.println(name.equals(name2));
		System.out.println(name.equalsIgnoreCase(name2));
		System.out.println(name.substring(0, 10));
		System.out.println(name3.trim());
		System.out.println(name.replace(" ", "space"));
		
		String array[] = name.split(" ");
		System.out.println(array[1]);
		System.out.println(array[0]);
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println(name.chars());
		System.out.println(name.codePointAt(0));
		System.out.println(name.codePointBefore(2));
		System.out.println(name.codePointCount(1, 4));
		System.out.println(name.codePoints());
		System.out.println(name.compareTo(name2));
		System.out.println(name.compareToIgnoreCase(name2));
		System.out.println(name.concat(name2));
		System.out.println(name.contains(name2));
		System.out.println(name.contentEquals(name2));
		
	}

}
