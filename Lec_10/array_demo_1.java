package Lec_10;

public class array_demo_1 {
	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4 };
		int[] a2 = { 23, 12, 14, 7 };
		System.out.println(a1[0] + "-" + a2[0]);
		int ans = swap(a1[0], a2[0]);
		a1[0] = ans;
		System.out.println(a1[0] + "-" + a2[0]);
	}

	public static int swap(int a, int b) {
		int c = a;
		a = b;
		b = c;
		return a;
	}

}
