package Lec_22;

public class Stack {
	int tos;
	int[] arr;
	public Stack(int cap) {
		arr = new int[cap];
		tos = -1;
	}
	public Stack() {
		this(5);
	}
	public int size() {
		return tos+1;
	}
	public boolean isEmpty() {
		return tos==-1;
	}
	public boolean isFull() {
		return tos==arr.length-1;
	}
	public void add(int ali) {
		tos++;
		arr[tos] = ali;
	}
	public int peek() {
		return arr[tos];
	}
	public int pop() {
		int ans = arr[tos];
		tos--;
		return ans;
		
	}
	
}
