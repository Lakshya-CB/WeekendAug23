package Lec_22;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_QPS {
	public static void main(String[] args) {
		Queue<Integer> Q = new LinkedList<>();
		Q.add(10);
		Q.add(20);
		Q.add(30);
		Q.add(40);
		System.out.println(Q);
		Rev(Q);
		System.out.println(Q);
//		System.out.println(Q.poll());
//		System.out.println(Q);
//		Q.add(50);
//		System.out.println(Q);
		int[] arr = {-20,10,-5,4,6,-9,-80,60,50};
		FirstNegWinK(arr, 3);
	}

	public static void Rev(Queue<Integer> Q) {
		if (Q.size() <= 1) {
			return;
		}
		int ali = Q.poll();
		Rev(Q);
		Q.add(ali);
	}

	public static void FirstNegWinK(int[] arr, int k) {
		Queue<Integer> Q = new LinkedList<>();
		for (int i = 0; i < k; i++) {
			if (arr[i] < 0) {
				Q.add(i);
			}
		}
		System.out.println(arr[Q.peek()]);
		for (int s = 1; s <= arr.length - k; s++) {
			if (!Q.isEmpty() && Q.peek() == s - 1) {
				Q.poll();
			}
			int e = s +k-1;
			if(arr[e]<0) {
				Q.add(e);
			}
			System.out.println(arr[Q.peek()]);
		}
	}
}
