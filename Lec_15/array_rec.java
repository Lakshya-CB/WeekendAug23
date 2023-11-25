package Lec_15;

public class array_rec {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
//		printArr(0, arr);
//		printRev(0, arr);
		System.out.println(Fac(4));
	}

	public static void printArr(int s, int[] arr) {
//		BP : printArr(s,arr)
//		SP : printArr(s+1,arr);
		if (s == arr.length) {
			return;
		}
		System.out.println(arr[s]);
		printArr(s + 1, arr);

	}

	public static void printRev(int s, int[] arr) {
//		BP : printRev(s,arr)
//		SP : printRev(s+1,arr)
		if (s == arr.length) {
			return;
		}
		printRev(s + 1, arr);
		System.out.println(arr[s]);

	}
//	{10,20,30,40};
	public static void print2(int s, int e, int[] arr) {
		if(s>e) {
			return;
		}
//		print(s,e)!!
		int mid = (s + e) / 2;
		print2(s, mid - 1, arr);
		System.out.println(arr[mid]);
		print2(mid + 1, e, arr);
	}
	public static int Fac(int n) {
		if(n==0) {
			return 1;
		}
		int sp = Fac(n-1);
		return sp*n;
	}
}
