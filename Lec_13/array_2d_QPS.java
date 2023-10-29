package Lec_13;

public class array_2d_QPS {
	public static void main(String[] args) {
		int[][] arr = { { 11 }, { 21 }, { 31 }, { 41 }, { 51 } };
//		wavey(arr);
		spiral(arr);
	}

	public static void wavey(int[][] arr) {
		for (int c = 0; c < arr[0].length; c++) {
			if (c % 2 == 0) {
				for (int r = 0; r < arr.length; r++) {
					System.out.print(arr[r][c] + " ");
				}
			}
			for (int r = arr.length - 1; r >= 0; r--) {
				System.out.print(arr[r][c] + " ");
			}
		}
	}

	public static void spiral(int[][] arr) {
		int minR = 0;
		int minC = 0;
		int cnt = 0;
		int tot = arr.length * arr[0].length;
		int maxR = arr.length - 1;
		int maxC = arr[0].length - 1;

		while (cnt < tot) {
			for (int r = minR; r <= maxR && cnt < tot; r++) {
				System.out.print(arr[r][minC] + " ");
				cnt++;
			}
			System.out.println();
			for (int c = minC + 1; c <= maxC && cnt < tot; c++) {
				System.out.print(arr[maxR][c] + " ");
				cnt++;
			}
			System.out.println();
			for (int r = maxR - 1; r >= minR && cnt < tot; r--) {
				System.out.print(arr[r][maxC] + " ");
				cnt++;
			}

			System.out.println();
			for (int c = maxC - 1; c >= minC + 1 && cnt < tot; c--) {
				System.out.print(arr[minR][c] + " ");
				cnt++;
			}
			System.out.println();

			minR++;
			minC++;
			maxR--;
			maxC--;
		}
	}

	public static boolean search(int[][] arr, int ali) {
		int r = arr.length - 1;
		int c = 0;
		while (r >= 0 && c < arr[0].length) {
			if (arr[r][c] == ali) {
				return true;
			} else if (arr[r][c] > ali) {
				r--;
			} else {
				c++;
			}
		}
		return false;
	}

}
