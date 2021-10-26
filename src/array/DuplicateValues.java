package array;

public class DuplicateValues {

	public static void main(String[] args) {
		// Find number of duplicate  in array

		int num[] = { 100, 33, 33, 100, 33, 1 };
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					 count++;
					
					
					}
				}

			}
		     System.out.println(count);
		     
		}

	}

