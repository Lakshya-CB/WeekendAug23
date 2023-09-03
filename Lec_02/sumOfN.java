package Lec_02;

public class sumOfN {
	public static void main(String[] args) {
		int n = 5;
		int c = 1;
		int sum = 0;
		while (c <= n) {
//			System.out.println(c);
			
			sum = sum + c;
			c = c + 1;
		}
		System.out.println(sum);
	}
}
