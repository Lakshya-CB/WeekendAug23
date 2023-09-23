package Lec_03;

import java.util.Scanner;

public class sample_in2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int nod = scn.nextInt();
		int sum = 0;
		int mult = 1;
		while (nod > 0) {
			int digit = scn.nextInt();
			sum = sum + digit * mult;
			mult = mult * 10;
			nod = nod - 1;
		}
		System.out.println(sum);
	}
}
