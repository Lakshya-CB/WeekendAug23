package Lec_09;

public class rotate2 {
	public static void main(String[] args) {
		int num = 12345;
		int rot = 400983;

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
		int divisor = (int) Math.pow(10, rot);
		int p1 = num / divisor;
		int p2 = num % divisor;
		System.out.println(p1 + " - " + p2);
		int ans = p2 * (int) Math.pow(10, nod - rot) + p1;
		System.out.println(ans);
	}
}
