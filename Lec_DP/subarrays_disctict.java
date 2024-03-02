package Lec_DP;

import java.util.HashSet;
import java.util.Scanner;

public class subarrays_disctict {
	public static void main(String[] args) {
//		int[] arr = { 1, 2, 3, 1, 4, 6, 1, 6 };
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i]= scn.nextInt();
		}
		solve(arr);
	}

	public static void solve(int[] arr) {
		HashSet<Integer> Set = new HashSet<>();
		int s = 0; // ali to del!!
		int e = 0; // ali to add!!
		long ans = 0;
		while (e < arr.length) {
			disp(arr, s, e);
			System.out.println(ans);
			System.out.println("=========");
			if (!Set.contains(arr[e])) {
				Set.add(arr[e]);
				e++;
				int n = (e-s);
				ans = ans + n*(n+1)/2;
			} else {
				Set.remove(arr[s]);
				s++;
			}
		}
		ans = ans %(1000000000+7);
		System.out.println(ans);
	}

	public static void disp(int[] arr, int s, int e) {
		for (int i = s; i < e; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
