package Lec_05;

import java.util.Scanner;

public class make_num_digits {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextInt();
		long cnt = 1;
		long ans = 0;
		long mult = 1;
		
		while (cnt <= n) {
			long digit = scn.nextInt();
			ans = ans + digit*mult;

			mult = mult*10;
			cnt++;
		}
		System.out.println(ans);

	}
}
