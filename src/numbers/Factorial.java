package numbers;

public class Factorial {

	public static void main(String[] args) {
		
		//find factorial of 10(10x9x8x7x6x5x4x3x2x1)
		int num = 17;
        long factorial = 1;
		for(int i=1; i<=num; i++) {
		factorial=factorial*i;
		}
System.out.println(factorial);
System.out.println("*******************");
	long factorials = 17;
	for(long j = factorials-1; j>=1; j--) {
		factorials = factorials*j;
	}
	System.out.println(factorials);
	}

}
