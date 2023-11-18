package Lec_14;

public class String_demo {
	public static void main(String[] args) {
		String str = "abcd";
		//////////////

		System.out.println("==============");
		char[] arr = str.toCharArray();
		for (char ch : arr) {
			System.out.println(ch);
		}
		System.out.println("==============");
		///////////
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(str.length() - 1));
		System.out.println("=========");
		System.out.println(str.startsWith("Ab")); // prefix!!
		System.out.println(str.endsWith("cd"));
		System.out.println("==============");
		str = "mera juta hein juta japan ka juta";
		System.out.println(str.indexOf("juta"));
		System.out.println(str.lastIndexOf("juta"));
//		str = "abcd";

//		System.out.println(str.substring(0,2));
//		printAllSubString(str);
		System.out.println("============");
		allPalinSS("nittin");

	}

	public static void printAllSubString(String str) {
		for (int s = 0; s < str.length(); s++) {
			for (int e = s + 1; e <= str.length(); e++) {
				String ss = str.substring(s, e);
				if (isPalin(ss)) {
					System.out.println(ss);
				}
			}
		}

	}

	public static boolean isPalin(String str) {
		int s = 0;
		int e = str.length() - 1;
		while (s <= e) {
			if (str.charAt(s) != str.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}

	public static void allPalinSS(String str) {
		for(int axis = 0;axis<str.length();axis++) {
			grow(axis, axis, str);// odd
			grow(axis, axis+1, str);// even
			
		}
	}
	public static void grow(int L, int R, String str) {
		while (L >= 0 && R < str.length()) {
			if (str.charAt(L) == str.charAt(R)) {
//				L to R!!
//				System.out.println(str.substring(L,R+1));
				L--;
				R++;
			} else {
				break;
			}
		}
	}

	public static boolean anagram(String s, String t) {
		int[] batua = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			batua[ch - 'a']++;
		}
		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			batua[ch - 'a']--;
		}
		for (int freq : batua) {
			if (freq != 0) {
				return false;
			}
		}
		return true;
	}
	public static void extractWords(String str) {
//		str = "the";
		while(true) {
			int f = str.lastIndexOf(" ");
			String word = str.substring(f+1);
			System.out.println(word);
			if(f<0) {
				break;
			}
			str = str.substring(0,f);
			
		}
	}
}
