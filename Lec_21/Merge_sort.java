package Lec_21;

import java.util.Arrays;

public class Merge_sort {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = { 5, 15, 16, 41, 42, 1000, 2000 };
		System.out.println(Arrays.toString(merge(arr1, arr2)));
	}

	public static int[] merge(int[] arr1, int[] arr2) {
		int i1 = 0;
		int i2 = 0;
		int i3 = 0;
		int[] arr3 = new int[arr1.length + arr2.length];
		while (i1 < arr1.length && i2 < arr2.length) {
			if (arr1[i1] <= arr2[i2]) {
				arr3[i3] = arr1[i1];
				i1++;
				i3++;
			} else {
				arr3[i3] = arr2[i2];
				i2++;
				i3++;

			}
		}
		while (i1 < arr1.length) {
			arr3[i3] = arr1[i1];
			i1++;
			i3++;
		}
		while (i2 < arr2.length) {
			arr3[i3] = arr2[i2];
			i2++;
			i3++;

		}
		return arr3;
	}

	public static int[] MS(int s, int e, int[] arr) {
//		{50,40,10,20,15}
		if(s==e) {
			int[] ans  = new int[1];
			ans[0] = arr[s];
			return ans;
		}
		int mid = (s + e) / 2;
		int sp1[] = MS(s, mid, arr);
		int[] sp2 = MS(mid + 1, e, arr);
		return merge(sp1, sp2);
	}
}
