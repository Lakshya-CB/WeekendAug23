package Lec_20;

import java.util.ArrayList;

public class tower_of_henoi {
	static ArrayList<Integer> A = new ArrayList<>();
	static ArrayList<Integer> B = new ArrayList<>();
	static ArrayList<Integer> C = new ArrayList<>();
	
	
	public static void main(String[] args) {
		int n = 3;
		
		for(int disk = n;disk >=1;disk-- ) {
			A.add(disk);
		}
//		MOVE(n, A, C, B);
		MOVE(n, "A","C", "B");
	}

	public static void MOVE(int n, 
			ArrayList<Integer> src,
			ArrayList<Integer> dest, 
			ArrayList<Integer> helper) {

		if (n == 0) {
			return;
		}
		MOVE(n - 1, src, helper, dest);
		int disk = src.remove(src.size() - 1);
		dest.add(disk);
		print();
		MOVE(n - 1, helper, dest, src);
	}
	public static void MOVE(int n, 
			String src,
			String dest, 
			String helper) {
		if (n == 0) {
			return;
		}
		MOVE(n - 1, src, helper, dest);
		System.out.println("shift "+n+"th disk from " +src+ " to "+dest);
		MOVE(n - 1, helper, dest, src);
	}
	public static void print() {
		System.out.println("src"+A );
		System.out.println("des"+C );
		System.out.println("hel"+B );
		System.out.println("==============");
	}
}
