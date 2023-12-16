package Lec_20;

public class String_bbb {

	public static void main(String[] args) {

		String str = "??";

		StringBuilder sb = new StringBuilder(str);
		System.out.println("--" + sb + "--");
		int n = 100;
		long start = System.currentTimeMillis();
		for (int i = 1; i <= n; i++) {
//			str = str + i;
			sb.append(i);
		}
//		str = sb+"";
		str = sb.toString();
		long end = System.currentTimeMillis();
		System.out.println((end - start) / 1000.0);

//		
		System.out.println(sb.substring(n));
		System.out.println(sb.charAt(0));
		System.out.println(sb.indexOf("0"));
		System.out.println(sb.lastIndexOf("0"));

		sb.setCharAt(2, '?');

		sb.insert(90, "??");

//		sb.reverse();

	}

	public static int pow(int a, int b) {
		if (b == 0) {
			return 1;
		}
		int sp = pow(a, b - 1);
		return sp * a;
	}

	public static int po(int a, int b) {
		if (b == 0) {
			return 1;
		}
		int sp = po(a, b / 2);
		if (b % 2 == 0) {
			return sp * sp;
		} else {
			return sp * sp * a;
		}
	}

}
