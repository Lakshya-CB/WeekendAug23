package Lec_25;

public class Binary_Tree {
	class Node {
		int data;
		Node left;
		Node right;
	}

	Node root;

	public void print() {
		print(root);
	}

	private void print(Node nn) {
		if (nn == null) {
			return;
		}
//		BP : 10k
		System.out.println(nn.data);
		print(nn.left);
		print(nn.right);
	}

	public int Size() {
		return Size(root);
	}

	private int Size(Node nn) {
		if (nn == null) {
			return 0;
		}
		int L = Size(nn.left);
		int R = Size(nn.right);

		return L + R + 1;
	}

	public int Ht() {
		return Ht(root);
	}

	private int Ht(Node nn) {
		if(nn==null) {
			return -1;
		}
		int L = Ht(nn.left);
		int R = Ht(nn.right);

		return Math.max(L, R) + 1;
	}
	public int Dia() {
		return Dia(root);
	}
	private int Dia(Node nn) {
		if(nn==null) {
			return 0;
		}
		int L = Dia(nn.left);
		int R = Dia(nn.right);
		int self = Ht(nn.left)+ Ht(nn.right)+2;
		return Math.max(self, Math.max(R, L));
	}

}
