package Lec_07;

public class Pat_07 {
	public static void main(String[] args) {
		int n = 11;
		int r = 1;
		while (r <= n) {
			int cnt_st = 0;
			while (cnt_st < n) {
//				if (r == 1 || r == n ||
//						cnt_st == 0 ||
//						cnt_st == n - 1) {
				if (r == cnt_st + 1 
						|| r + cnt_st == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				cnt_st++;
			}

			r++;
			System.out.println();
		}
	}
}
