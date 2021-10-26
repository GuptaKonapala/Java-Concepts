
public class Programs {

	public static void main(String[] args) {
		arrayMaxandMin();
		factorial();
		armstrongNumber();
		sumofnumbers();
	}

	public static void arrayMaxandMin() {
		int array[] = { 10, 3, 2, 5, 3, 60 };
		int max = array[0];
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
	
	public static void factorial() {
		int num = 20;
		long factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}

	public static void armstrongNumber() {
		int num = 153;
		int armstrong = 0;
		while (num > 0) {
			int k = num % 10;
			num = num / 10;
			armstrong = armstrong + (k * k * k);
		}
		if (armstrong == num) {
			System.out.println(num + "   is a armstrong number");
		} else {
			System.out.println(num + " is NOT a armstrong number");
		}
	}
	public static void sumofnumbers() {
		int ar[] = {1,3,6,8,9,6,4};
		for(int i = 0; i<ar.length; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]+ar[j]==10) {
					System.out.println(ar[i]+" "+ar[j]);
				}
			}
		}
	}
	

}
