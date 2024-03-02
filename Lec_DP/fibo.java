package Lec_DP;

public class fibo {
	public static void main(String[] args) {
		int n = 50000;
		System.out.println(FiboTD(n, new Integer[n + 1]));
//		System.out.println(FibBU(n));
	}

	public static int Fibo(int n) {
		if (n <= 1) {
			return n;
		}
		int sp1 = Fibo(n - 1);
		int sp2 = Fibo(n - 2);
		return sp1 + sp2;
	}

	public static int FiboTD(int n, Integer[] dp) {
		if (n <= 1) {
			return n;
		}
		if (dp[n] != null) {
			return dp[n];
		}
		int sp1 = FiboTD(n - 1, dp);
		int sp2 = FiboTD(n - 2, dp);
		dp[n] = sp1 + sp2; // stored!!
		return sp1 + sp2;
	}

	public static int FibBU(int N) { // 1)input arg biggest prob
		int[] dp = new int[N + 1]; // 2) dp
		for (int n = 0; n <= N; n++) { // 3) loop!!
//			4) self work!! dp[n]!! curent sub problem!!
			if (n <= 1) {
				dp[n]= n;
				continue;
			}
			int sp1 = dp[n - 1];
			int sp2 = dp[n - 2];
			dp[n] = sp1 + sp2;
		}
		return dp[N];

	}
	public static int aBUSE(int N) {
		if(N<=1) {
			return N;
		}
		int pre1 = 1;
		int pre2 = 0;
		for (int n = 2; n <= N; n++) {			
			int sp1 = pre1;
			int sp2 = pre2;
			int curr = sp1 + sp2;
			pre2 = pre1;
			pre1 = curr;
		}
		return pre1;

	}
}
