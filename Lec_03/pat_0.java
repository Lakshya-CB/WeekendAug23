package Lec_03;

public class pat_0 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		while (row <= n) {

			int cnt_st = 0;
			while (cnt_st < n) {
				System.out.print("*");
				cnt_st = cnt_st + 1;
			}
			row = row + 1;
			System.out.println();
		}
	}
}
