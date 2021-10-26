
public class Revision {

	public static void main(String[] args) {
		/* 1.Numbers from 1 to 10
		    2.Sum of 10 numbers
		    3.Mathematical Operators
		    4.Multiplication Table
		    5.Max Value in Integer
		    6.Factorial
		    7.Fibonacci
		    8.Integer Reverse and Palindram */

		// 1.Numbers from 1 to 10
		int a =10;
		for(int b=1; b<=a; b++) {
			System.out.print(b+" ");
		}System.out.println(" ");
		
		// 2.Sum of 10 numbers
		int sum = 10;
		System.out.println(sum*(sum+1)/2);
		// 2.1 Sum of some numbers starting from any number to ending with any number
		int value=0;
		for(int ans=5; ans<=sum; ans++) {
			value=value+ans;
		}System.out.println(value);
		
		// 3.Mathematical Operators
		int num1=20;
		int num2=10;
		System.out.print(num1+" + "+num2+" = "+(num1+num2)+", ");
		System.out.print(num1+" - "+num2+" = "+(num1-num2)+", ");
		System.out.print(num1+" x "+num2+" = "+(num1*num2)+", ");
		System.out.print(num1+" / "+num2+" = "+(num1/num2)+", ");
		System.out.println(num1+" mod "+num2+" = "+(num1%num2));
		
		// 4.Multiplication Table
		int table = 13;
		for(int temp=1; temp<=10; temp++) {
			System.out.print(table+" x "+(table*temp)+", ");}
		System.out.println(" ");
		
		// 5.Max Value in Integer
		int g=10;
		int h=20;
		int i=15;
		if(g>h&i<g) {
			System.out.println("Max Value is g");}
			else if(h>i) {
				System.out.println("Max Value is h");}
			else System.out.println("Max Value is i");

		// 6.Factorial
		int j=10;
		int factorial=1;
		for(int k= 1; k<j; k++) {
			factorial=factorial*k;
		}System.out.println(factorial);
		
		// 7.Fibonacci (some number of fibonacci numbers)
		int l= 0;
		int m=1;
		int num=0;
		for(int n=0; n<10; n++) {
			 num=l+m;
			System.out.print(l+" ");
			l=m;
			m=num;}
		System.out.println(" ");
		// 7.1 Fibonacci (Within some number of fibonacci numbers)
		int sample1=0;
		int sample2=1;
		int number=0;
		System.out.print(sample1+" ");
		for(;number<100000;) {
			number=sample1+sample2;
			sample1=sample2;
			sample2=number;
			System.out.print(sample1+" ");}
		System.out.println(" ");
		
		// 8.Integer Reverse Order and Palindram
		int o = 5345;
		int q = o;
		int p = 0;
		while(o>0) {
			p = p*10+(o%10);
			o=o/10;}
		System.out.println(p);
		if(q==p) {
			System.out.println(true);
		}else System.out.println(false);
	}
			
	}

