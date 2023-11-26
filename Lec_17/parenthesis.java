package Lec_17;

import java.util.ArrayList;
import java.util.List;

public class parenthesis {
	public static void main(String[] args) {
		List<String> AL = new ArrayList<>();
		gen(3, 3, "",AL);
	}

	public static void gen(int op, int cl, 
			String path,List<String> AL) {
		if (op == 0 && cl == 0) {
			System.out.println(path);
			AL.add(path);
			return;
		}
		if(op>cl) {
			return;
		}
//		BP : (3,3,"")
		if (op > 0) {
			gen(op - 1, cl, path + "(",AL);
		}
		if (cl > 0) {
			gen(op, cl - 1, path + ")",AL);
		}
	}

}
