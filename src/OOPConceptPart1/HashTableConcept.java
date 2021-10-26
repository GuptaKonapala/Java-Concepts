package OOPConceptPart1;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put(1, 100);
		h.put('a', "Test");
		h.put("key", 'b');
		System.out.println(h.size());
		System.out.println(h.get(1));
		System.out.println(h.get("key"));
		
		Hashtable<Integer,String> hs = new Hashtable<Integer, String>();
		hs.put (2, "hey");
		System.out.println(hs.get(2));
	}

}
