package Lec_03;

public class digit_extraction {
	public static void main(String[] args) {
		int num = 1234;
		int ans = 0;
		while (num > 0) {
			int digit = num % 10;
//			System.out.print(digit);
			num = num / 10;
			ans = ans * 10 + digit;
		}
		System.out.println(ans);
	}
}
