package Lec_02;

public class Fibonacci {
	public static void main(String[] args) {
		int n = 6;
		int cnt = 1;
		int a = 0;
		int b = 1;
		int c = 0;
		while (cnt <= n) {
			c = a + b;
//			System.out.println(c);
			a = b;
			b = c;
			cnt++;
		}
		System.out.println(a);
	}
}
