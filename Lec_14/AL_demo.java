package Lec_14;

import java.util.ArrayList;

public class AL_demo {
	public static void main(String[] args) {
//		Wrapper classes!!
//		Integer I = null; // heap!!
//		int i = 100; // stack!!

		ArrayList<Integer> AL = new ArrayList<>();

		System.out.println(AL.size());
		System.out.println(AL);
		AL.add(10);

		System.out.println(AL);
		AL.add(20);
		System.out.println(AL);

		AL.add(30);
		System.out.println(AL);

		AL.add(40);
		System.out.println(AL);
		
		AL.add(AL.size(), 25);
		System.out.println(AL);
		
//		arr[i]!! get indexing!!
		System.out.println(AL.get(2));
//		set!!
		AL.set(2, -1);
		System.out.println(AL);
//		ArrayList delete!!
		AL.remove(2);
		System.out.println(AL);
	}
	public static ArrayList<Integer> Intersection(
			
			int[] arr1, 
			
			int[]arr2) {
		ArrayList<Integer> ans = new ArrayList<>();
		
		return ans;
	}
}
