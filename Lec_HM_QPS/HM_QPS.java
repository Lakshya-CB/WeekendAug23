package Lec_HM_QPS;

import java.util.HashMap;
import java.util.HashSet;

public class HM_QPS {
	public static void main(String[] args) {
//		int[] nums = { 2, 7, 11, 15 };
//		int target = 9;
//		int[] arr = new int[2];
//		int[] arr1 = { 30, 20, 40, 50, 70, 30, 20, 20, 50, 50, 20 };
//		int[] arr2 = { 50, 80, 30, 20, 20, 20, 90, 50, 20 };
//		Intersection(arr1, arr2);

		int[] arr = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6 };
		longest(arr);
	}

	public static int[] solve(int[] arr, int t) {
//		HashMap<arr[i],i> HM = new HashMap<>();
		HashMap<Integer, Integer> HM = new HashMap<>();

		for (int idx = 0; idx < arr.length; idx++) {
			HM.put(arr[idx], idx);
		}
		for (int idx = 0; idx < arr.length; idx++) {
			int ali = arr[idx];
			int ali2 = t - ali;
			if (HM.containsKey(ali2)) {
				int[] ans = new int[2];
				ans[0] = idx;
				ans[1] = HM.get(ali2);
				return ans;
			}
		}
		return null;
	}

	public static void Intersection(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> HM = new HashMap<>();
//		HashMap<ali2, freq>!!
		for (int ali2 : arr2) {
//			int prev_f = 0;
//			if (HM.containsKey(ali2)) {
//				prev_f = HM.get(ali2);
//			}
//			HM.put(ali2, prev_f + 1);
			int prev_f = HM.getOrDefault(ali2, 0);
			HM.put(ali2, prev_f + 1);

		}
		System.out.println(HM);
		for (int ali1 : arr1) {
			if (HM.containsKey(ali1) && HM.get(ali1) > 0) {
				int prev_freq = HM.get(ali1);
				HM.put(ali1, prev_freq - 1);
				System.out.println(ali1);
			}
		}

		System.out.println(HM);
	}

	public static void longest(int[] arr) {
		HashSet<Integer> HS = new HashSet<>();
		for (int ali : arr) {
			HS.add(ali);
		}
		for (int ali : arr) {
			if (!HS.contains(ali - 1)) {
				int head = ali;
				int temp = head;
				while (HS.contains(temp)) {
					System.out.print(temp + "=>");
					temp++;
				}
				System.out.println();
			}
		}
	}
}
