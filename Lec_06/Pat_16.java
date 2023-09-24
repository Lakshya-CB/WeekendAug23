package Lec_06;

public class Pat_16 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int total_sp = n - 1;
		int total_st = n;
		while (row <= 2 * n - 1) {
			int cnt_sp = 0;
			while (cnt_sp < total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}

			int cnt_st = 0;
			while (cnt_st < total_st) {
				System.out.print("* ");
				cnt_st++;
			}

			System.out.println();
			if (row < n) {
				total_st--;
				total_sp--;
			} else {
				total_st++;
				total_sp++;

			}
			row++;

		}
	}
}
