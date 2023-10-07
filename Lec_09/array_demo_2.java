package Lec_09;

public class array_demo_2 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int num = 2;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = num;
			num = num + 2;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
