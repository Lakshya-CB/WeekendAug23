package Lec_05;

import java.util.Scanner;

public class shopping {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int R = scn.nextInt();
		while(R>0) {
			R--;
			
			int max_A = scn.nextInt();
			int max_H = scn.nextInt();
			
			int A = 0;
			int H = 0;
			int phone = 1;
			
			while (true) {
				A = A + phone;
				phone++;
				if(A>max_A) {
					System.out.println("Harshit");
					break;
				}

				H = H + phone;
				phone++;
				if(H>max_H) {
					System.out.println("Aayush");
					break;
				}
			}
		}
	}
}
