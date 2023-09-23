package Lec_05;

import java.util.Scanner;

public class replace {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int ans = 0;
		int mult = 1;
		while (num > 0) {
			int digit = num % 10;
			if (digit == 0) {
				digit = 5;
			}

			ans = ans + digit * mult;
			mult = mult * 10;

			num = num / 10;
		}
		if(ans==0) {
			ans = 5;
		}
		System.out.println(ans);
	}
}
