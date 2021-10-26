
public class RevisionArray {

	public static void main(String[] args) {
		// 1.Array Reverse Order
		// 2.Duplicate Values
		// 3.Max and Min Value in Array
		
		// 1.Array Reverse Order
		int array []= {12, 23, 34, 45, 56};
		for(int a=array.length-1; a>=0; a--) {
			System.out.print(array[a]+" ");}
		System.out.println(" ");
		
		// 2.Duplicate Values
		int array1[]= {1,2,3,4,5,6,7,7,6,5,4,3,2,1};
		int count = 0;
		for(int b=0; b<array1.length; b++) {
			for(int c=b+1; c<array1.length; c++) {
				if(array1[b]==array1[c]) {
					count++;
				}
			}
		}System.out.println(count);
		
		// 3.Max and Min Value in Array
		int array2[]= {105,200,380,400,50};
		int max=array2[0];
		int min=array2[0];
		for(int d=0; d<array2.length; d++) {
			if(array2[d]>max) {
				max=array2[d];
			}if(array2[d]<min) {
				min=array2[d];
			}
		}System.out.println(max);
		System.out.println(min);
	}

}
