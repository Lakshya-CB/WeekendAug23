package Lec_16;

public class Letter_key_pad_combination {
	public static void main(String[] args) {
		LKC("23", "");
	}

	public static void LKC(String buttons, String path) {
//		bp: (234)
//		Sp: (34)
		if(buttons.isEmpty()) {
			System.out.println(path);
			return;
		}
		char ch = buttons.charAt(0);// ch = '2'
		String ops = optionsPossible(ch-'0');//"abc"
		String sp = buttons.substring(1);
		for(int i=0;i<ops.length();i++) {
			LKC(sp, path+ ops.charAt(i));
		}
	}

	public static String optionsPossible(int i) {
		String[] arr = { "", "", "abc", "ef", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		return arr[i];
	}
}
