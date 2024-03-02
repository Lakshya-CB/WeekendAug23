package Lec_DP;

public class exchanging_coins {
	public static void main(String[] args) {

	}

	public static int solve(int n) {
		if(n==0) {
			return 0;
		}
		int sp1 = n;
		int sp2 = solve(n/2)+ solve(n/3)+solve(n/4);
		return Math.max(sp1, sp2);
	}
}
