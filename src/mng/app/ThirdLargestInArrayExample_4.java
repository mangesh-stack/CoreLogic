package mng.app;

public class ThirdLargestInArrayExample_4 {
	public static int getThirdLargest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total -1]-a[0];
	}

	public static void main(String args[]) {
		int[] a = { 6, 8, 1, 9, 2, 1, 10, 3, 11 };
		int length=a.length;
       
		System.out.println("Third Largest: " + getThirdLargest(a, length));
	}
}