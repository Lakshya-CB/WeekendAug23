package Lec_04;

public class pat_6 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int total_sp = 0;
		int total_st = n;
		while (row <= n) {
			int cnt_sp = 0;
			while (cnt_sp < total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			int cnt_st = 0;
			while (cnt_st < total_st) {
				System.out.pr
				int("* ");
				cnt_st++;
			}
			
			total_sp=total_sp+2;
			total_st--;
			row++;
			System.out.println();
		}
	}
}
