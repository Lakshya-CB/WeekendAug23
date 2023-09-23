package Lec_04;

public class pat_04 {
	public static void main(String[] args) {
		int n = 9;
		int row = 1;
		int total_sp = n - 1;
		int total_st = 1;
		while (row <= n) {
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

//			prep!! next row !!
			System.out.println();
			total_st++;
			total_sp--;
			row++;
		}
	}
}
