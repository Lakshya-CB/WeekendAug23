package Lec_04;

public class pat_03 {
public static void main(String[] args) {
	int n = 5;
	int row = 1;
	int total_st = n;
	while(row<=n) {
		int cnt_st =0;
		while(cnt_st<total_st) {
			System.out.print("* "
					+ "");
			cnt_st++;
		}
		total_st = total_st-1;
		System.out.println();
		row++;
	}
}
}
