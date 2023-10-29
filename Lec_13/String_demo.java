package Lec_13;

public class String_demo {
	public static void main(String[] args) {
		String str = "abcd";

		System.out.println(str.length());

//		get ith char!!
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));

	}

	public static boolean isPalindrome(String str) {
		int s = 0;
		int e = str.length() - 1;
		while (s < e) {
			//rotator
			if (str.charAt(s) != str.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;

	}
}
