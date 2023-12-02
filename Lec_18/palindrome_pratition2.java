package Lec_18;

import java.util.ArrayList;
import java.util.List;

public class palindrome_pratition2 {
	public static void main(String[] args) {
		List<String> AL_bag = new ArrayList<>();
		kaat("nittin", "", AL_bag);
	}

	public static void kaat(String table, String bag, List<String> AL_bag) {
//		BP : table = "abcd"
		if (table.isEmpty()) {
			System.out.println(bag);
			System.out.println(AL_bag);
			System.out.println("==========");
			return;
		}
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String piece = table.substring(0, chakku);
			if (isPalin(piece)) {
				String remain = table.substring(chakku);

				List<String> AL_bag2 = new ArrayList<>(AL_bag);
				AL_bag2.add(piece);
				kaat(remain, bag + "," + piece, AL_bag2);
			}

		}
	}

	private static boolean isPalin(String piece) {
		// TODO Auto-generated method stub
		int L = 0;
		int R = piece.length()-1;
		while(L<R) {
			if(piece.charAt(L)!=piece.charAt(R)) {
				return false;
			}
			L++;R--;
		}
		return true;
	}
}
