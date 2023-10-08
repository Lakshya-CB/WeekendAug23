package Lec_09;

public class array_demo_4 {
	public static void main(String[] args) {

		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] a2 = a1;
		a1[0] = 99;
		System.out.println(a1[0]);
		System.out.println(a2[0]);
	}
}
	