package Lec_09;

public class F_to_c {
	public static void main(String[] args) {
		int minF = 0;
		int maxF = 100;
		int step = 20;
		for (int F = 0; F <= maxF; F = F + step) {
			int C = 5 * (F - 32) / 9;
			System.out.println(F + " - " + C);
		}
	}
}
