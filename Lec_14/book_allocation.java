package Lec_14;

import java.util.Scanner;

public class book_allocation {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			t--;
			int[] books = new int[scn.nextInt()];
			int total_students = scn.nextInt();

			int e = 0;

			for (int i = 0; i < books.length; i++) {
				books[i] = scn.nextInt();
				e = books[i] + e;
			}
			
			int s = 0;
			int ans =-1;
			while(s<=e) {
				int mid = (s+e)/2;
				if(isPossible(books, total_students, mid)) {
					ans = mid;
					e = mid-1;
				}else {
					s = mid+1;
				}
			}
			System.out.println(ans);

		}
	}

	public static boolean isPossible(int[] books, int totalStudents, int maxWorkload) {
//	is it possible to create a arrengement where the maximum
//	workload received by any student is <=maxWorkload
		int currLoad = 0;
		int currStudent = 1;
//		12,34,67,90 
//		maxLoad= 150!!
		for (int book : books) {
			if (book > maxWorkload) {
				return false;
			}
			if (currLoad + book <= maxWorkload) {
				currLoad = currLoad + book;
			} else {
				currStudent++;
				currLoad = book;
			}
		}
		return currStudent <= totalStudents;
	}
}
