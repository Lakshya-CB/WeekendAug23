package Lec_19;

public class combination {
	public static void main(String[] args) {
//		comb_wrt_PT(4, 3, -1, "");
		queen_wrt_U(0, 2, "", 3);
	}

	public static void queen_wrt_U(int curr, int QTP, String path, int totalSeats) {
		if (QTP == 0) { // +ve BC
			System.out.println(path);
			return;
		}
		if (curr == totalSeats) { // -ve BC!!
			return;
		}

		queen_wrt_U(curr + 1, QTP - 1, path + "Q" + curr, totalSeats); // include
		queen_wrt_U(curr + 1, QTP, path, totalSeats); // exclude

	}

	public static void comb_wrt_PT(int total, int toPick, int prev, String path) {
		if (toPick == 0) {

			System.out.println(path);
			return;
		}
		for (int curr = prev + 1; curr < total; curr++) {
//			curr =>2 dabba!!
			comb_wrt_PT(total, toPick - 1, curr, path + "b" + curr);
		}
	}
}
