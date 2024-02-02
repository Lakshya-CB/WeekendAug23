package Lec_25_26;

public class Client {
	public static void main(String[] args) {
//		int[] pre = { 10, 20, 40, 50, 30 };
//		int[] in = { 20, 50, 40, 10, 30 };
//		Binary_Tree BT = new Binary_Tree(pre, in);
		int[] pre = {10,20,40,-1,-1,50,-1,-1,30,-1,60};
		Binary_Tree BT = new Binary_Tree(pre);
		
		BT.print();
		BT.lvl();
	}
}
