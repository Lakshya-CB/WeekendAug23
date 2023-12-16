package Lec_20;

public class dict_order_diff {
	public static void main(String[] args) {

		String str = "aabb";

		int[] batua = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			batua[ch - 'a']++;
		}
		solve(batua, str);
	}

	public static void solve(int[] batua, String path) {
		boolean pos_bc = true;
		for(int ali : batua) {
			if(ali!=0) {
				pos_bc = false;
			}
		}
		if(pos_bc) {
			System.out.println(path);
			return;
		}
		for (int i = 0; i < batua.length; i++) {
			if (batua[i] > 0) {
				pos_bc = false;
				batua[i]--;
				char ch = (char) ('a' + i);
				solve(batua, path + ch);
				batua[i]++;
			}
		}
		
	}

}
