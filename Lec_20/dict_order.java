package Lec_20;

public class dict_order {
	public static void main(String[] args) {
		String limit = "aaabbb";
		
		perm(limit,"",limit);
	}
	public static void perm(String str, String path,
			String limit) {
//		if(path.compareTo(limit)>0) {
//			return;
//		}
//		str = "abcd"
		if(str.isEmpty()) {
			System.out.println(path);
			return;
		}
		for(int i=0;i<str.length();i++) {
//			i = 2
			char ch = str.charAt(i); //"c"
			String sp = str.substring(0,i)+ str.substring(i+1);
			perm(sp, path+ch,limit);
			
		}
	}
}
