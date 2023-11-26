package Lec_17;

public class maze_2d {
	public static void main(String[] args) {
		chal(0, 0, "", 2, 2);
	}

	public static void chal(int r, int c, String path, int dest_R, int dest_C) {
		if (r == dest_R && c == dest_C) {
			System.out.println(path);
			return;
		}
		if (r > dest_R || c > dest_C) {
			return;
		}

		chal(r, c + 1, path + "R", dest_R, dest_C);
		chal(r + 1, c, path + "D", dest_R, dest_C);

	}
}
