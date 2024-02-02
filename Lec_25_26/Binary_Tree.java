package Lec_25_26;

import java.util.LinkedList;
import java.util.Queue;

public class Binary_Tree {
	class Node {
		public Node(int i) {
			// TODO Auto-generated constructor stub
			data = i;
		}

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
		String str = "";
		if(nn.left!=null) {
			str = nn.left.data+"";
		}
		str = str+"=>"+nn.data+"<=";
		if(nn.right!=null) {
			str = str + nn.right.data;
		}
//		BP : 10k
		System.out.println(str);
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

	int max_dia = 0;

	private int Ht(Node nn) {
		if (nn == null) {
			return -1;
		}
		int L = Ht(nn.left);
		int R = Ht(nn.right);

		int self_dia = L + R + 2;
		max_dia = Math.max(self_dia, max_dia);
		return Math.max(L, R) + 1;
	}

	public int Dia() {
		return Dia2(root).Ht;
	}

	private int Dia(Node nn) {
		if (nn == null) {
			return 0;
		}
		int L = Dia(nn.left);
		int R = Dia(nn.right);
		int self = Ht(nn.left) + Ht(nn.right) + 2;
		return Math.max(self, Math.max(R, L));
	}

	class pairHtDia {
		int Ht = -1;
		int Dia = 0;
	}

	private pairHtDia Dia2(Node nn) {
		if (nn == null) {
			return new pairHtDia();
		}
		pairHtDia L = Dia2(nn.left);
		pairHtDia R = Dia2(nn.right);

		pairHtDia ans = new pairHtDia();
//		Ht apne Tree!!
		ans.Ht = Math.max(L.Ht, R.Ht) + 1;
//		Dia apne Tree ka!!
		int self = L.Ht + R.Ht + 2;

		ans.Dia = Math.max(self, Math.max(L.Dia, R.Dia));

		return ans;
	}

	public boolean isBal() {
		return isBal(root);

	}

	private boolean isBal(Node nn) {
		if (nn == null) {
			return true;
		}
		boolean L = isBal(nn.left);
		boolean R = isBal(nn.right);

		boolean self = Math.abs(Ht(nn.left) - Ht(nn.right)) <= 1;

		return L && R && self;
	}

	class pairBalHt {
		int Ht = -1;
		boolean isB = true;
	}

	private pairBalHt isBal2(Node nn) {
		if (nn == null) {
			return new pairBalHt();
		}
		pairBalHt L = isBal2(nn.left);
		pairBalHt R = isBal2(nn.right);

		pairBalHt ans = new pairBalHt();

		ans.Ht = Math.max(L.Ht, R.Ht) + 1;
		boolean self = Math.abs(L.Ht - R.Ht) <= 1;

		ans.isB = L.isB && R.isB && self;
		return ans;
	}

	public Binary_Tree(int[] pre, int[] in) {
		root = solve(pre, 0, pre.length-1, in, 0, in.length-1);
	}

	private Node solve(int[] pre, int ps, int pe, int[] in, int is, int ie) {
		if (ps > pe || is > ie) {
			return null;
		}
		Node nn = new Node(pre[ps]);
		int f = -1;
		int L_s = 0;
		for (int i = is; i <= ie; i++) {
			if (in[i] == pre[ps]) {
				f = i;
				break;
			}
			L_s++;
		}
		nn.left = solve(pre, ps + 1, ps + L_s, in, is, f - 1);
		nn.right = solve(pre, ps + L_s + 1, pe, in, f + 1, ie);
		return nn;
	}
	int pIdx =0;
	public Binary_Tree(int[] pre) {
		root = createPre(pre);
	}

	private Node createPre(int[] pre) {
		if(pIdx>=pre.length|| pre[pIdx]==-1) {
			pIdx++;
			return null;
		}
		Node nn = new Node(pre[pIdx]);
		pIdx++;
		
		nn.left = createPre(pre);
		nn.right = createPre(pre);
		return nn;
	}
	public void lvl() {
		Queue<Node> Q=  new LinkedList<>();
		Q.add(root);
		while(!Q.isEmpty()) {
			Node nn = Q.poll();
			System.out.println(nn.data);
			if(nn.left!=null) {
				Q.add(nn.left);
			}
			if(nn.right!=null) {
				Q.add(nn.right);
			}
		}
	}
	
}
