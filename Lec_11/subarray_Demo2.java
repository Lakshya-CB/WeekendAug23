package Lec_11;

public class subarray_Demo2 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, -31, 25, 10 };
		maxSubarraySum2(arr);
	}

	public static void maxSubarraySum2(int[] arr) {
//		int sum =0;//A		
		for (int s = 0; s < arr.length; s++) {
			int sum = 0;// B
			for (int e = s; e < arr.length; e++) {
//				System.out.println(s + " - " + e);
//				int sum = 0;// C
				sum = sum + arr[e];
				System.out.println("=>" + sum);
				if (sum < 0) {
					break;
				}
			}
		}
	}

	public static void maxSubarraySum1(int[] arr) {
//		int sum =0;//A	
		for (int s = 0; s < arr.length; s++) {
//			int sum = 0;//B
			for (int e = s; e < arr.length; e++) {
//				System.out.println(s + " - " + e);
				int sum = 0;// C
				for (int i = s; i <= e; i++) {
					System.out.print(arr[i] + " ");
					sum = sum + arr[i];
				}
				System.out.println("=>" + sum);
			}
		}
	}

	public static void MaxSubarraySum(int[] arr) {
		int sum = 0;
		int ans =Integer.MIN_VALUE;
		for (int ali : arr) {
			sum = sum + ali;
			if (sum < 0) {
				m,. 
				sum = 0;
			}
			if(sum > ans) {
				ans = sum;
			}
		}
	}

}
