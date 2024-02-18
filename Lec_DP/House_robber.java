package Lec_DP;

public class House_robber {
	public static void main(String[] args) {
		System.out.println(looto(0,houses,new Integer[houses.length]));
	}

	public static int looto(int idx, int[] houses, Integer[] dp) {
		if (idx == houses.length) {
			return 0;
		}
		if(dp[idx]!=null) {
			return dp[idx];
		}
		int sp1 = looto(idx + 1, houses,dp);
		int sp2 = houses[idx] + looto(idx + 2, houses,dp);
		dp[idx] = Math.max(sp1, sp2);
		return Math.max(sp1, sp2);
	}
	public static int BU(int[] houses) {
		int[] dp = new int[houses.length+2];
		for(int idx = houses.length-1;idx>=0;idx--) {
			
//			dp[idx]!!
			int sp1 = dp[idx + 1];
			int sp2 = houses[idx] + dp[idx + 2];
			dp[idx] = Math.max(sp1, sp2);
		}
		return dp[0];
	}
}
