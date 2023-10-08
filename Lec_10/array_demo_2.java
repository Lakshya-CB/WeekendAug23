package Lec_10;

public class array_demo_2 {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40 };
		int[] arr2 = { 1, 2, 3, 4 };
		System.out.println(arr1[0] + " " + arr2[0]);
//		swap(arr1, arr2);
		swap_in(arr1, arr2, 0);
		System.out.println(arr1[0] + " " + arr2[0]);

	}

	public static void swap_in(int[] a, int[] b, int c) {
		int d = a[c];
		a[c] = b[c];
		b[c] = d;

	}

	public static void swap(int[] arr1, int[] arr2) {
		int[] temp = arr1;
		arr1 = arr2;
		arr2 = temp;
	}

}
