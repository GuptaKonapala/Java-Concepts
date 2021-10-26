package string;

public class RemovingJunkChar {

	public static void main(String[] args) {
			String name = "*&G@#u^!)p%%#t)@&#$a *#&*K@(*#*@(o#&&^#*@(n!!@%#^#a&#^$*@p*!#^@*a$&@(@l@(*$&(@a)#$*@&";
			name = name.replaceAll("[^a-zA-Z0-9 ]", "");
			System.out.println(name);
	}

}
