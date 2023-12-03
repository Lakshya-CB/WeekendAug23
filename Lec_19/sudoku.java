package Lec_19;

public class sudoku {
	public static void main(String[] args) {
		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		solve(0, 0, board);
	}

	public static void solve(int r, int c, char[][] board) {
		if (c == 9) {
			r++;
			c = 0;
		}
		if (r == 9) {
			print(board);
			return;
		}
		if (board[r][c] == '.') {
			for (char ch = '1'; ch <= '9'; ch++) {
				if (isSafe(board, r, c, ch)) {
					board[r][c] = ch;
					solve(r, c + 1, board);
				}
			}
			board[r][c] = '.';
		} else {
			solve(r, c + 1, board);
		}
	}

	private static boolean isSafe(char[][] board, int r, int c, char ch) {
		// TODO Auto-generated method stub
		for(int R = 0;R<9;R++) {
			if(board[R][c]==ch) {
				return false;
			}
		}
		for(int C = 0;C<9;C++) {
			if(board[r][C]==ch) {
				return false;
			}
		}
		return true;
	}

	private static void print(char[][] board) {
		for (char[] arr : board) {
			for (char ch : arr) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
		System.out.println("===========");
	}
}
