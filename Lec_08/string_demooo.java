package Lec_08;

import java.util.Scanner;

public class string_demooo {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str2 = "abcd";
		System.out.println(str2);
		char ch = str2.charAt(3);
		System.out.println(ch);
		System.out.println("==============");
		
		String str = "hello";
		System.out.println(str);
		
		
		System.out.println(10 + "hello");
		System.out.println((10 + 20) + "hello" + 10 + 20);
		System.out.println(10 + 20 + "hello" + (10 + 20));
		System.out.println(10 + 20 + "hello" + 10 + 20);
		
	}
}
