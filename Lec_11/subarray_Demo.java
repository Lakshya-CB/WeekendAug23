package Lec_11;

public class subarray_Demo {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };

		for (int s = 0; s < arr.length; s++) {
			for (int e = s; e < arr.length; e++) {
//				System.out.println(s + " - " + e);
				for(int i=s;i<=e;i++) {
					System.out.print(arr[i]+ " ");
				}
				System.out.println();
			}
		}
//		int s = 0;
//		for (int e = 0; e < arr.length; e++) {
//			System.out.println(s + " - " + e);
//		}
//
//		s = 1;
//		for (int e = 1; e < arr.length; e++) {
//			System.out.println(s + " - " + e);
//		}
//		
//		s = 2;
//		for (int e = 2; e < arr.length; e++) {
//			System.out.println(s + " - " + e);
//		}
	}
}
