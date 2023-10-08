package Lec_10;

public class ROTATE {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		print(arr);
		ratata(arr, 13);
		print(arr);

	}

	public static void print(int[] arr) {
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
	}

	public static void ratata(int[] arr, int rot) {
		rot= rot%arr.length;

		System.out.println("=================");
		for (int r = 0; r < rot; r++) {
			int jeb = arr[arr.length - 1];
			for (int idx = arr.length - 2; idx >= 0; idx--) {
				arr[idx + 1] = arr[idx];
			}
			arr[0] = jeb;
			print(arr);
		}
		System.out.println("=================");

	}
}
