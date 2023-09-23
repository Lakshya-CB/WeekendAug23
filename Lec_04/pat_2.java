package Lec_04;

public class pat_2 {
	public static void main(String[] args) {
		int n = 10;
		int row = 1;
		while(row<=n) {
//			Step 2: star print => ek row mein!!
			int cnt_st = 0;
			int total_st = row;
			while(cnt_st<total_st) {
				System.out.print("* ");
				cnt_st = cnt_st+1;
			}
			System.out.println();
			row++;
		}
		
	}
}
