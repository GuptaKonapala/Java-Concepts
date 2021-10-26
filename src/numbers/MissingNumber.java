package numbers;

public class MissingNumber {

	public static void main(String[] args) {
		int a[] = {-4,-3,-1,0,1,2,3,4,5,6,7,8};
		int sum = 0;
		int sum1 = 0;	
		for(int i =0; i<a.length; i++) {
			sum = sum+a[i];
		}System.out.println(sum);
		
//		int k = a[3];
//		k++;
//		System.out.println(k);										//		Observe this to understand the below loop
		
		for(int j= a[0]; j<=a[a.length-1]; j++) {
			sum1 = sum1+j;
		}System.out.println(sum1);
		int missingNumber = sum1-sum;
		System.out.println(missingNumber);
	}
	}
