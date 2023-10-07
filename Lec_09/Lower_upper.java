package Lec_09;

public class Lower_upper {
	public static void main(String[] args) {
		char ch = 'K';
		if (ch >= 'a' && ch <= 'z') {
			System.out.println("lower");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("upper");
		} else {
			System.out.println("pata nahi!");
		}
	}
}
