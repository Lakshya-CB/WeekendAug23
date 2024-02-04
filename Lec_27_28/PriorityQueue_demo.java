package Lec_27_28;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue_demo {
	public static void main(String[] args) {
		PriorityQueue<Integer> PQ =
				new PriorityQueue<>();
		PQ.add(10);
		PQ.add(100);
		PQ.add(50);
		PQ.add(5);
		PQ.add(6);
		PQ.add(101);
		PQ.add(99);
		
		System.out.println(PQ);
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
//		System.out.println(PQ);
//		System.out.println(PQ.peek());
//		System.out.println(PQ.poll());
//		System.out.println(PQ.peek());
//		System.out.println(PQ);
	}
}
