package Lec_09;

import java.util.Scanner;

public class array_demo_3_input {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr = new int[size];
//		arr[0] = scn.nextInt();
//		arr[1] = scn.nextInt();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
//			System.out.println(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "-");
		}
	}
}
