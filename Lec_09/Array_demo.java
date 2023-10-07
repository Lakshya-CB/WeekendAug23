package Lec_09;

import java.util.Scanner;

public class Array_demo {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[5];
//		System.out.println(arr);
//
//		System.out.println(arr.length);
////		indexing!! array in java!!
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//
////		System.out.println(arr[5]);
////		System.out.println(arr[-1]);
//
//		System.out.println(arr[arr.length - 1]);
//		
//		arr[0] =  5;
//		arr[1] = 10;
//		arr[2] = 15;
//		arr[3] = 20;
//		arr[4] = 25;
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
//			System.out.println(arr[i]);
		}
		
//		for(int j:arr) {
//			j=scn.nextInt();
//		}

	}
}
