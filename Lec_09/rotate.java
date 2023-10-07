package Lec_09;

public class rotate {
	public static void main(String[] args) {
		int num = 12345;
		int rot = 400989;

		int baackup = num;

		int nod = 0;
		while (num > 0) {
			nod++;
			num = num / 10;
		}

//		System.out.println(nod);
		rot = rot % nod;
//		System.out.println(rot);
//#######################
		num = baackup;
		for (int r = 0; r < rot; r++) {
			int p1 = num / 10;
			int p2 = num % 10;
//			System.out.println(p1 + "-" + p2);
			int mult = (int) Math.pow(10, nod - 1);
			System.out.println(p1 + p2 * mult);
			num = p1 + p2 * mult;
		}
	}
}
