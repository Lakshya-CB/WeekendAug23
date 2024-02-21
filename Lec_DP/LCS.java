package Lec_DP;

public class LCS {
	public static void main(String[] args) {

	}

	public static int solve(int idx1, int idx2, String str1, String str2) {
			if (str1.length() == idx1 || str2.length() == idx2) {
				return 0;
			}
		if (str1.charAt(idx1) == str2.charAt(idx2)) {
			return 1 + solve(idx1 + 1, idx2 + 1, str1, str2);
		} else {
			int sp1 = solve(idx1 + 1, idx2, str1, str2);
			int sp2 = solve(idx1, idx2 + 1, str1, str2);
			return Math.max(sp1, sp2);
		}
	}

	public static int BU(String str1, String str2) {
		int[][] dp = new int[str1.length() + 1][str2.length() + 1];
		for (int idx1 = str1.length(); idx1 >= 0; idx1--) {
			for (int idx2 = str2.length(); idx2 >= 0; idx2--) {
				if (str1.length() == idx1 || str2.length() == idx2) {
					dp[idx1][idx2]=0;
					continue;
				}
				if (str1.charAt(idx1) == str2.charAt(idx2)) {
					dp[idx1][idx2] = 1 + dp[idx1 + 1][idx2 + 1];
				} else {
					int sp1 = dp[idx1 + 1][idx2];
					int sp2 = dp[idx1][idx2 + 1];
					dp[idx1][idx2] = Math.max(sp1, sp2);
				}
			}
		}
		return dp[0][0];

	}
}
