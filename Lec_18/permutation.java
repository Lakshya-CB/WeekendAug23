package Lec_18;

public class permutation {
	public static void main(String[] args) {
		int total_boxes = 3;
		int toPick = 2;
		perm(total_boxes, toPick, "", new boolean[total_boxes]);
	}

	public static void perm(int total_boxes, int toPick, String path, boolean[] board) {
		if (toPick == 0) {
			System.out.println(path);
			return;
		}
		for (int b = 0; b < total_boxes; b++) {
			if (board[b] == false) {
				board[b] = true;
				perm(total_boxes, toPick - 1, path + "b" + b, board);
				board[b] = false;
			}
		}
	}
}
