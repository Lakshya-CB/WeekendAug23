package Lec_08;

public class functions_demo {
	public static void main(String[] args) {
		naacho();
		System.out.println("0");
		naacho();
		add(10, 20);
		add3(10, 20, 30);
		int ans = add(10,20);
		Math.pow(10, 2);
		System.out.println("ans"+ans);
		

	}

	public static void naacho() {
		System.out.println("naach bhai!!");
	}

	public static int add(int a, int b) {
		System.out.println(a + b);
		return a+b;
	}

	public static void add3(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}
