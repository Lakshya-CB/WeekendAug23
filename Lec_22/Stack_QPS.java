package Lec_22;

import java.util.Arrays;
import java.util.Stack;

public class Stack_QPS {
	public static void main(String[] args) {
		Stack<Integer> S = new Stack<>();
		S.add(10);
		S.add(20);
		S.add(30);
		S.add(40);
		S.add(50);
		S.add(60);
		S.add(70);
		S.add(80);

		System.out.println(S);
		System.out.println(S.pop());

		System.out.println(S);
		System.out.println(S.pop());
		System.out.println(S);
		int[] arr = { 50, 30, 20, 40, 10, 45, 5, 60, 15, 8 };
		nextGr8er2(arr);
	}

	public static void Rev(Stack<Integer> S) {
		Stack<Integer> E1 = new Stack<>();
		while (!S.isEmpty()) {
			E1.add(S.pop());
		}
		Stack<Integer> E2 = new Stack<>();
		while (!E1.isEmpty()) {
			E2.add(E1.pop());
		}
		while (!E2.isEmpty()) {
			S.add(E2.pop());
		}
	}

	public static void nextGr8er(int[] arr) {
		Stack<Integer> S = new Stack<>();
		for (int B : arr) {
			while (!S.isEmpty() && S.peek() < B) {
				int A = S.pop();
				System.out.println(A + "->" + B);
			}
			S.add(B);
		}
	}

	public static void nextGr8er2(int[] arr) {
		Stack<Integer> S = new Stack<>();
		int[] ans = new int[arr.length];
		int b_idx = 0;
		for (int B : arr) {
			while (!S.isEmpty() && arr[S.peek()] < B) {
				int A_idx = S.pop();
				ans[A_idx] = B;
				System.out.println(arr[A_idx] + "->" + B);
			}
			S.add(b_idx);
			b_idx++;
		}
		System.out.println(Arrays.toString(ans));
	}
}
