package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistConcept {

	public static void main(String[] args) {

		//int a[] = new int[3]; // static array -- size if fixed

		ArrayList<Object> ar = new ArrayList<Object>(); // dynamic array --
		// can contain duplicate values/elements
		// maintains insertion order
		// synchronized
		// allows random access to fetch the element because it stores the values on the
		// basis of index

		ar.add(100); // 0
		ar.add(200); // 1
		ar.add(300); // 2
		System.out.println(ar.size()); // to print the size
		ar.add(400); // 3
		ar.add(500); // 4
		System.out.println(ar.size());
		ar.add("Tom"); // 5
		ar.add('H'); // 6
		ar.add(12.33); // 7
		ar.remove(3); // we can remove also. and we removed 3 then size is decreased to 7
		System.out.println(ar.size());
		System.out.println(ar.get(5)); // to print specific value

		// to print all the values in arralist
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		// to print only specified data types then we have to mention that data type in
		// object creation its called generic. without mentioning data type is called
		// non generic
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(200);
		System.out.println(ar1.get(0));
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("String");
		ar2.add("Names");
		System.out.println(ar2.get(0));
		
		//	Employee class objects :
		Employee e1 = new Employee("Mehta", 28, "QA");
		Employee e2 = new Employee("Samata", 26, "Admin");
		Employee e3 = new Employee("Suresh", 30, "Dev");
		
		// Create ArrayList
		ArrayList<Employee> ar3 = new ArrayList<Employee>();
		ar3.add(e1);
		ar3.add(e2);
		ar3.add(e3);
		
		// iterator to traverse values
		Iterator<Employee> it   = ar3.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
			System.out.println("***************");
		
		// addall() method
			ArrayList<Object>  ar4 = new ArrayList<Object> ();
			ar4.add(100); // 0
			ar4.add(200); // 1
			ar4.add(300); // 2
			
			 System.out.println("ar4 values" +ar4);
			ArrayList<Object> ar5 = new ArrayList<Object> ();
			ar5.add("aha"); // 0
			ar5.add("oho"); // 1
			ar5.add(200); // 2
			System.out.println("ar5 values" +ar5);
			
			ar4.addAll(ar5); //  merge ar5 into ar4
			System.out.println("ar4 values after adding ar5" +ar4);					
					
			// removeall
			ar4.removeAll(ar5); //  remove merged ArrayList
			System.out.println("ar4 after removing ar5"+ar4);
			for(int i = 0; i<ar4.size(); i++) {
				System.out.println(ar4.get(i));
			}
			// retainall
			ar4.retainAll(ar5); // to get common values
			for (int j=0; j<ar4.size(); j++) {
				System.out.println(ar4.get(j));
				}
			System.out.println("***********************");
			
			ArrayList<Object> ar6 = new ArrayList<Object> ();
			ar6.add("aha"); // 0
			ar6.add("oho");
			ArrayList<Object> ar7 = new ArrayList<Object> ();
			ar7.add("1000"); // 0
			ar7.add("times");
			
			ar6.addAll(ar7);
			for (int m=0; m<ar6.size();m++) {
				System.out.println(ar6.get(m));
			}
			System.out.println("*******************");
			
			ar6.removeAll(ar7);
			for (int n = 0; n<ar6.size();n++) {
				System.out.println(ar6.get(n));
			}
			
	}
	
}

		
	
