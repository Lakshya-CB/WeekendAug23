package Lec_08;

public class globaal_demo {
	static int val = 100;

	public static void main(String[] args) {
		System.out.println(globaal_demo.val);
		fun(20);
	}

	public static void fun(int a) {
		System.out.println(val);
		int val = 20;
		System.out.println(val);
		System.out.println(globaal_demo.val);
		val = val + 60;
		globaal_demo.val = val + 10;
		System.out.println(val);
		System.out.println(globaal_demo.val);
	}
}
