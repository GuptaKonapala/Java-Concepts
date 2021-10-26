package numbers;

public class IntegerReverseAndPalindram {

	public static void main(String[] args) {
		int num = 487;
		int temp=num;
		
		int rev=0; 														// Method 1 using while loop
		while (num !=0) {
			rev= rev*10+ (num%10);  //7    78    784
			num=num/10;   //48    4   0
		}
		System.out.println(rev);
		
		if(temp==rev) {System.out.println(true);}
		else {System.out.println(false);
		}
		System.out.println("----------------");
		
		
		for(; temp>0; temp=temp/10) {						 // Method 2 using for loop (can't check palindram)
			System.out.print(temp%10);
		}
		
		
			}
}
