package Lec_DP;

public class climb_Stairs {
	public static void main(String[] args) {
		int n = 3;
		System.out.println(chalo(n, new Integer[n+1]));
	}

//	public static void chalo(int n, String path) {
//		if(n<0) {
//			return;
//		}
//		if(n==0) {
//			System.out.println(path);
//			return;
//		}
//		chalo(n-1, path+"1");
//		chalo(n-2, path+"2");
//	}
	public static int chalo(int n, Integer[] dp) {
		if(n<0) {
			return 0;
		}
		if(n==0) {
			return 1;
		}
		if(dp[n]!=null) {
			return dp[n];
		}
		int sp1 = chalo(n-1,dp);
		int sp2 = chalo(n-2,dp);
		dp[n] = sp1+sp2;
		return sp1+sp2;
	}
	public static int BU(int N) {
		int [] dp = new int[N+1];
		for(int n = 0;n<=N;n++) {
//			dp[n]!!
			if(n==0) {
				dp[n]= 1;
				continue;
			}
			int sp1 = 0;
			if (n>=1) { sp1 = dp[n-1];}
		
			int sp2 = 0;
			if(n>=2) { sp2 = dp[n-2];}
			dp[n] = sp1+sp2;
		}
		return dp[N];
	}
}
