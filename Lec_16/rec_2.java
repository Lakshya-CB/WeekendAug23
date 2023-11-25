package Lec_16;

public class rec_2 {
	public static void main(String[] args) {
//		System.out.println(Fibo(4));
//		CoinToss(2, "");
//		climbStairs(0, 3, "");
		subSeq("ab", "");
		System.out.println("????????????");
	}

	public static void subSeq(String rem, String path) {
		if(rem.length()==0) {
			System.out.println(path);
			return;
		}
//		BP : ss("abcd","")
		char ch = rem.charAt(0);
		String sp = rem.substring(1);
		subSeq(sp, path + ch); // Include!!
		subSeq(sp, path); // Exclude!!
	}

	public static void climbStairs(int curr, int dest, String path) {
		if (curr == dest) {
			System.out.println(path);
			return;
		}
		if (curr > dest) {
			return;
		}

		climbStairs(curr + 1, dest, path + 1);
		climbStairs(curr + 2, dest, path + 2);
	}

	public static void CoinToss(int n, String path) {
		if (n == 0) {
			System.out.println(path);
			return;
		}
		CoinToss(n - 1, path + "H");
		CoinToss(n - 1, path + "T");

	}

	public static int Fibo(int n) {
		if (n <= 1) {
			return n;
		}
//	BP : F(n)
//	Sp : F(n-1) and F(n-2)
		int sp1 = Fibo(n - 1);
		int sp2 = Fibo(n - 2);
		return sp1 + sp2;
	}
}
