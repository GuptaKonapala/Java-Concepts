package array;

public class MaxandMinValueinArray {

	public static void main(String[] args) {
		// 3.find the max and min values
				int t[] = new int[6];
				t[0] = 40;
				t[1] = 10;
				t[2] = 30;
				t[3] = 50;
				t[4] = 70;
				t[5] = 80;

				// // Max value
				// if (t[0] > t[1] & t[0] > t[2]) {
				// System.out.println(t[0]);
				// } else if (t[1] > t[2]) {
				// System.out.println(t[1]);
				// } else {
				// System.out.println(t[2]);
				// }
				//
				// // Min value
				// if (t[0] < t[1] & t[0] < t[2]) {
				// System.out.println(t[0]);
				// } else if (t[1] < t[2]) {
				// System.out.println(t[1]);
				// } else {
				// System.out.println(t[2]);
				// }

				int max = t[0];
				int min = t[0];
				for (int i = 1; i < t.length; i++) {
					if (t[i] > max)
						{
						max = t[i];
					}
					if (t[i] < min) {
						min = t[i];
					}

				}

				System.out.println("max is :" + max);
				System.out.println("min is :" + min);

			
				System.out.println("--------------------");

				int small1 = t[0];
				for (int k = 1; k < t.length; k++) {
					if (t[k] < small1)

					{
						small1 = t[k];
					}
				}
				System.out.println(small1);


	}

}
