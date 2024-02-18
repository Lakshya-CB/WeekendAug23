package Lec_DP;

import java.util.PriorityQueue;

public class Client {
	public static void main(String[] args) {
		PriorityQueue<Student> PQ = new PriorityQueue<>((a,b)->a.Age-b.Age);
		PQ.add(new Student(10, "A"));
		PQ.add(new Student(14, "bb"));
		PQ.add(new Student(7, "ac"));
		PQ.add(new Student(21, "AF"));
		PQ.add(new Student(15, "A"));
		
		System.out.println(PQ);
	}
}
