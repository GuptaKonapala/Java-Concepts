
public class RevisionString {

	public static void main(String[] args) {
		// 1.String Reverse
		// 2.Find no.of Vowels in a String
		
		// 1.String Reverse
		String str="Java Practice";
		for(int a=str.length()-1; a>=0; a--) {
		System.out.print(str.charAt(a));
		}System.out.println(" ");

		// 2.Find no.of Vowels a String
		String string="Selenium";
		int count=0;
		for(int b=0; b<string.length(); b++) {
			if(string.charAt(b)== 'a' || string.charAt(b)== 'e' || string.charAt(b)== 'i' || string.charAt(b)== 'o' || string.charAt(b)== 'u') {
				count++;
			}
				
		}System.out.println(count);
	}

}
