package string;

public class Vowels {

	public static void main(String[] args) { 						// method 1 using string
		String name = "aebjhu";
		String temp ="aeiou";
		int vowels=0; 
		for(int a=0; a<name.length(); a++) {
			for(int b=0; b<temp.length(); b++)
			{
			if(name.charAt(a)==temp.charAt(b)) 
				vowels++;
			}
		}
System.out.println(vowels);

System.out.println("***************");

 int count = 0;																			// method 2 using or operator
for (int i=0; i<name.length(); i++)
{
			if(  name.charAt(i) == 'a'  || name.charAt(i)=='e'||  name.charAt(i) == 'i'  || name.charAt(i)=='o'|| name.charAt(i) == 'u'   ) {
		count++;
			}
}System.out.println(count);
	}
}
