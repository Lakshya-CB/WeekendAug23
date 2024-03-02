package Lec_DP;

import java.util.ArrayList;
import java.util.HashMap;

public class LIS {
	public static void main(String[] args) {
		int[] arr = { 2, 10, 9, 2, 5, 3, 7, 101, 18 };
//		System.out.println(solve(0, Integer.MIN_VALUE, arr, new HashMap<>()));
//		System.out.println(solve(0, -1, arr, new Integer[arr.length][arr.length + 1]));
//		System.out.println(BU(arr));
		System.out.println(BS(arr));
	}

//	HashMap<idx, HashMap<prev,Ans>>!!
	public static int solve(int idx, int prev, int[] arr, HashMap<Integer, HashMap<Integer, Integer>> HM) {
		if (idx == arr.length) {
			return 0;
		}
		if (HM.containsKey(idx) && HM.get(idx).containsKey(prev)) {
			return HM.get(idx).get(prev);
		}
		int sp1 = 0;
		if (arr[idx] > prev) {
			sp1 = 1 + solve(idx + 1, arr[idx], arr, HM); // inc
		}
		int sp2 = solve(idx + 1, prev, arr, HM);
		HashMap<Integer, Integer> idx_HM = HM.getOrDefault(idx, new HashMap<>());
		idx_HM.put(prev, Math.max(sp1, sp2));
		HM.put(idx, idx_HM);
		return Math.max(sp1, sp2);
	}

	public static int solve(int idx, int prev_idx, int[] arr, Integer[][] dp) {

//		solve(idx,p_idx) = dp[i][p_i+1]
		if (idx == arr.length) {
			return 0;
		}
		if (dp[idx][prev_idx + 1] != null) {
			return dp[idx][prev_idx + 1];
		}
		int sp1 = 0;
		if (prev_idx == -1 || arr[idx] > arr[prev_idx]) {
			sp1 = 1 + solve(idx + 1, idx, arr, dp); // inc
		}
		int sp2 = solve(idx + 1, prev_idx, arr, dp);
		dp[idx][prev_idx + 1] = Math.max(sp1, sp2);
		return Math.max(sp1, sp2);
	}

	public static int BU(int[] arr) {
		int[][] dp = new int[arr.length + 1][arr.length + 1];
		for (int idx = arr.length - 1; idx >= 0; idx--) {
			for (int prev_idx = arr.length - 1; prev_idx >= -1; prev_idx--) {
//				solve(idx,prev_idx)!! = >dp[idx][prev_idx + 1]3
				int sp1 = 0;
				if (prev_idx == -1 || arr[idx] > arr[prev_idx]) {
					sp1 = 1 + dp[idx + 1][idx + 1]; // inc
				}
				int sp2 = dp[idx + 1][prev_idx + 1];
				dp[idx][prev_idx + 1] = Math.max(sp1, sp2);
			}
		}
		return dp[0][-1+1];
	}
//	binary search 
	public static int BS(int[] arr) {
		ArrayList<Integer> AL = new ArrayList<>();
		for(int ali: arr) {
			if(AL.isEmpty()|| ali > AL.get(AL.size()-1)) {
				AL.add(ali);
			}else {
//				AL = {2,5,7,10,15,20} , int ali = 7 
//					 {c,c,b,b ,b ,b}
				int s = 0;
				int e  = AL.size()-1;
				int f =  e;
				while(s<=e) {
					int mid = (s+e)/2;
					if(AL.get(mid)>=ali) {
//						bigggy!!
						f = mid;
						e = mid-1;
					}else {
						s = mid+1;
					}
				}
				AL.set(f, ali);
			}
			System.out.println(ali + "=>"+AL);
		}
		return AL.size();
	}
}
