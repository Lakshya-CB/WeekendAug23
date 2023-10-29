package Lec_13;

public class array2d_demo2 {
	public static void main(String[] args) {
		int num = 1;
		int[][] mat = new int[4][3]; // Row x Col!!

		for (int r = 0; r < mat.length; r++) {
			for (int c = 0; c < mat[r].length; c++) {
				mat[r][c] = num;
				num++;
			}
		}
		
		for(int[] row_arr : mat){
			System.out.println(row_arr);
			for(int ali: row_arr) {
				System.out.print(ali+ " ");
			}
			System.out.println("=-----");
		}
	}
}
