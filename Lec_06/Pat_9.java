package Lec_06;

public class Pat_9 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int total_sp = n - 1;
		int total_st = 1;
		int ntp = 1;
		while (row <= n) {
			int cnt_sp = 0;
			while (cnt_sp < total_sp) {
				System.out.print("\t");
				cnt_sp++;
			}
			int cnt_st = 0;
			while (cnt_st < total_st) {
				System.out.print(ntp+"\t");

				ntp++;
				cnt_st++;
			}
			total_sp--;
			total_st = total_st + 2;
			System.out.println();
			row++;
		}

	}
}
