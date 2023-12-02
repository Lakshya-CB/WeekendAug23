package Lec_18;

import java.util.ArrayList;
import java.util.List;

public class palindrome_pratition {
	public static void main(String[] args) {
		List<String> AL_bag = new ArrayList<>();
		kaat("abc", "", AL_bag);
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
			String remain = table.substring(chakku);
//			System.out.println(piece + " - "+ remain);
//			M1
//			Array List acting like a string with concatination
			List<String> AL_bag2 = new ArrayList<>(AL_bag);
			AL_bag2.add(piece);
			kaat(remain, bag + "," + piece, AL_bag2); 
			
//			==========================
//			M2  explicit backtraking!!
//			AL_bag.add(piece); // prep!!
//			kaat(remain, bag + "," + piece, AL_bag); 
//			AL_bag.remove(AL_bag.size()-1); // explicit backtracking!!

		}
	}
}
