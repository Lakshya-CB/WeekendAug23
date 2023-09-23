package Lec_03;

public class GCD {
	public static void main(String[] args) {
		int num1 = 16;
		int num2 = 60;
		int divisor = num2;
		int dividend = num1;
		while (divisor > 0) {
			int R = dividend % divisor;
			dividend = divisor;
			divisor = R;
		}
		System.out.println(dividend);

	}
}
