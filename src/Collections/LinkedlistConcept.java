package Collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistConcept {

	public static void main(String[] args) {
		LinkedList<String>ll = new LinkedList<String>();
		ll.add("Car");
		ll.add("Benz");
		ll.add("Volks");
		System.out.println(ll);
		System.out.println(ll.get(1));
		
		
		LinkedList<String>l = new LinkedList<String>(Arrays.asList("om", "od", "od"));				//		One line List Creation
		System.out.println(l.get(1));
		
		
		// add first and last
		ll.addFirst("Vehicle");
		ll.addLast("Motors");
		System.out.println(ll);
		
		// set
		ll.set(1, "BMW");
		System.out.println(ll);

		// remove first and last
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);

		// remove specific position
		ll.remove(1);
		System.out.println(ll);
		
		// print all the values of Linkedlist
		
		// using for loop
		System.out.println("using for loop");
		for (int a=0; a<ll.size(); a++) {
			System.out.println(ll.get(a));
		}
		// using advance for loop
		System.out.println("using advance for loop");
		for(String str : ll) {
			System.out.println(str);
		}
		// using while loop
		System.out.println("using while loop");
				int b=0;
				while(b<ll.size()) {
					System.out.println(ll.get(b));
					b++;
		}
		// using Iterator
		System.out.println("using iterator");
		Iterator<String>it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
	}	

}
