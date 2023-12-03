package Lec_19;

public class comb_qd {
	public static void main(String[] args) {
		int n = 4;
		queen2D(0, 0, n, "", n, n, new boolean[n][n]);
	}

	public static void queen2D(int r, int c, int QTP, String path, int totalR, int totalC, boolean[][] board) {
		if (QTP == 0) {
			System.out.println(path);
			printB(board);
			return;
		}
		if (c == totalC) {
			c = 0;
			r++;
		}
		if (r == totalR) {
			return;
		}
		if (isSafe(r, c, board)) {
			board[r][c] = true;
			queen2D(r, c + 1, QTP - 1, path + "Q{" + r + "," + c + "}", totalR, totalC, board);
			board[r][c] = false;
		}
		queen2D(r, c + 1, QTP, path, totalR, totalC, board);

	}

	private static boolean isSafe(int r, int c, boolean[][] board) {
		// TODO Auto-generated method stub
		for (int R = 0; R < r; R++) {
			if (board[R][c]) {
				return false;
			}
		}
		for (int C = 0; C < c; C++) {
			if (board[r][C]) {
				return false;
			}
		}
		int R = r;
		int C = c;
		while (R >= 0 && C >= 0) {
			if (board[R][C]) {
				return false;
			}
			R--;
			C--;
		}

		int R2 = r;
		int C2 = c;
		while (R2 >= 0 && C2 < board[0].length) {
			if (board[R2][C2]) {
				return false;
			}
			R2--;
			C2++;
		}
		return true;
	}

	public static void printB(boolean[][] board) {
		for (boolean[] row : board) {
			for (boolean b : row) {
				if (!b) {
					System.out.print(".");
				} else {
					System.out.print("Q");
				}
			}
			System.out.println();
		}
		System.out.println("====================");

	}
}
