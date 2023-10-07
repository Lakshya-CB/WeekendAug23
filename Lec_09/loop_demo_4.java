package Lec_09;

public class loop_demo_4 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int num = 5;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = num;
			num = num + 2;
		}
//		enhanced loop. for each loop!!
//		read only!!
//		for(int aloo: arr) {
//			System.out.println(aloo);
//			aloo = 9999;
//		}
		
	}
}
