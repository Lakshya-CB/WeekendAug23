package Lec_21;

import java.util.Arrays;

public class quiiick_sooooooooooooort {
	public static void main(String[] args) {
		int[] arr = { 50, 40, 80, 90, 70, 10, 30, 60, 120 };
		System.out.println(Arrays.toString(arr));
		QS(0, arr.length - 1, arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void QS(int s, int e, int[] arr) {
		if (s >= e) {
			return;
		}
		int L = s;
		int R = e;
		int pivot = arr[(s + e) / 2];
		while (L <= R) {
			while (arr[L] < pivot) {
				L++;
			}
			while (arr[R] > pivot) {
				R--;
			}
//			L and R!! chwaap!!
			if (R >= L) {
				int temp = arr[L];
				arr[L] = arr[R];
				arr[R] = temp;
				L++;
				R--;
			}

		}
		QS(s, R, arr);
		QS(L, e, arr);

	}
}
