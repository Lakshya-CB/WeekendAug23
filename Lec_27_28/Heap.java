package Lec_27_28;

import java.util.ArrayList;

public class Heap {
	ArrayList<Integer> AL = new ArrayList<>();
	
	public int size() {
		return AL.size();
	}
	public boolean isEmpty() {
		return AL.isEmpty();
	}
	public void add(int ali) {
		AL.add(ali);
		upheapify(AL.size()-1);
	}
	private void upheapify(int ch) {
		int p = (ch-1)/2;
		if(AL.get(p)>AL.get(ch)) {
			swap(p,ch);
			upheapify(p);
		}
	}
	private void swap(int p, int ch) {
		
	}
}
