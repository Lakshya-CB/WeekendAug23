package Lec_10;

public class array_basic_QPS {
	public static void main(String[] args) {
		int[] arr = { 10, 2, 98, 33, 1, 5 };
//		System.out.println(maxAam(arr));
//		revPrint(arr);
		print(arr);
		reverse(arr);
		print(arr);
	}

	public static void print(int[] arr) {
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
	}

	public static int maxAam(int[] bori) {
//		int jeb =bori[0];
		int jeb = Integer.MIN_VALUE;

		for (int aam : bori) {
//			System.out.println(aam);
			if (aam > jeb) {
				jeb = aam;
			}
		}
		return jeb;
	}

	public static int find(int[] arr, int ali) {
		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
			if (arr[i] == ali) {
				return i;
			}
		}
		return -1;
	}

	public static void revPrint(int[] arr) {
		int i = arr.length - 1;
		for (; i >= 0;) {
			System.out.println(arr[i]);
			i--;
		}
	}

	public static void reverse(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i < arr.length - 1) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
}
