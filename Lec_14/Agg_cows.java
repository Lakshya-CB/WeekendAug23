package Lec_14;

import java.util.Arrays;
import java.util.Scanner;

public class Agg_cows {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] barns = new int[scn.nextInt()];
		int totalC = scn.nextInt();
		for(int i=0;i<barns.length;i++) {
			barns[i] = scn.nextInt();
		}
		Arrays.sort(barns);
		int s = 0;
		int e = barns[barns.length-1]-barns[0];
		int ans = -1;
		while(s<=e) {
			int mid = (s+e)/2;
			if(isPossible(barns, totalC, mid)) {
				ans = mid;
				s=mid+1;
			}else {
				e =mid-1;
			}
		}
		System.out.println(ans);
		
		
	}

	public static boolean isPossible(int[] barns, int total_Cows, int d) {
//		is it possible to place all my cows in my barn such
//		that the distance between any 2 cows >=d
		int prev_cow_barn = barns[0];
		int curr_cows = 1;
		for(int barn: barns) {
			if(barn-prev_cow_barn>=d) {
				curr_cows++;
				prev_cow_barn = barn;
			}
		}
		return curr_cows>=total_Cows;
	}
}
