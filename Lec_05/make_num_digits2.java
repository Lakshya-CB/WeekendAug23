package Lec_05;

import java.util.Scanner;

public class make_num_digits2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		long cnt = 1;
		long ans = 0;
		long mult = (long)Math.pow(10, n-1);
		
		while (cnt <= n) {
			long digit = scn.nextInt();
			ans = ans + digit*mult;
			System.out.println(mult);
			mult = mult/10;
			cnt++;
		}
		System.out.println(ans);

	}
}
