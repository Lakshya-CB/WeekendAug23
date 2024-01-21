package Lec_23;

import java.util.Stack;

public class LinkedList {
	class Node {
		public Node(int ali) {
			// TODO Auto-generated constructor stub
			data = ali;
//			next = null;
		}

		int data;
		Node next;
	}

	Node head;

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "=>");
			temp = temp.next;
		}
		System.out.println();
	}

	public int size() {
		int size = 0;

		Node temp = head;
		while (temp != null) {
//			System.out.println(temp.data);
			temp = temp.next;
			size++;
		}
		return size;
	}

	public int getFirst() {
		if (isEmpty()) {
			throw new RuntimeException("Kya deekh rha hein?");
		}
		return head.data;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int getAt(int idx) {
		if (idx < 0 || idx >= size()) {
			throw new RuntimeException("kahan ?!");
		}
		Node temp = head;
		for (int cnt = 0; cnt < idx; cnt++) {
			temp = temp.next;
		}
		return temp.data;
	}

	private Node getAtNode(int idx) {
		if (idx < 0 || idx >= size()) {
			throw new RuntimeException("kahan ?!");
		}
		Node temp = head;
		for (int cnt = 0; cnt < idx; cnt++) {
			temp = temp.next;
		}
		return temp;
	}

	public int getLast() {
		if (isEmpty()) {
			throw new RuntimeException("kahan ?!");
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}

	public void addLast(int ali) {
		if (isEmpty()) {
			addFirst(ali);
			return;
		}
		Node nn = new Node(ali);
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = nn;
	}

	public void addFirst(int ali) {
		Node nn = new Node(ali);
		nn.next = head;
		head = nn;
	}

	public void addAt(int idx, int ali) {
		if (idx < 0 || idx > size()) {
			throw new RuntimeException("index out of bounds");
		}
		if (idx == 0) {
			addFirst(ali);
		} else if (idx == size()) {
			addLast(ali);
		} else {
			Node curr = new Node(ali);
			Node prev = getAtNode(idx - 1);
			Node after = prev.next;

			prev.next = curr;
			curr.next = after;
		}
	}

	public int removeFirst() {
		int data = head.data;
		head = head.next;
		return data;
	}

	public int removeLast() {
		Node secondLast = getAtNode(size() - 2);
		Node last = secondLast.next;

		secondLast.next = null;
		return last.data;
	}

	public int removeAt(int idx) {
		Node prev = getAtNode(idx - 1);
		Node curr = prev.next;
		Node after = curr.next;

		prev.next = after;
		return curr.data;

	}

	public void Rev() {
		Node curr = head;
		Node prev = null;
		while (curr != null) {
			Node after = curr.next;
//			System.out.println(curr.data + " - "+prev);
			curr.next = prev;
			
			prev = curr;
			curr = after;
		}
		head = prev;
	}
	public void rev_2() {
		rev(head);
	}

	private Node rev(Node nn) {
		if(nn.next == null) {
			head = nn;
			return nn;
		}
//		Bp : rev(10k)
//		SP : Rev(10k.next // 20k)
		Node tail = rev(nn.next);
		tail.next = nn;
		nn.next = null;
		return nn;
	}
	public  void revK(int k) {
		Stack<Node> S = new Stack<>();
		Node curr = head;
		
		Node new_head = null;
		Node new_tail = null;
		
		while(curr!=null) {
			Node after = curr.next;
			S.add(curr);
			if(S.size()==k) {
//				pop !! 
//				add at the end in your new linkedlist
				while(!S.isEmpty()) {
					Node temp = S.pop();
					if(new_head==null) {
						new_head = temp;
						new_tail = temp;
						new_tail.next = null;
					}else {
						new_tail.next = temp;
						new_tail  = temp;
						new_tail.next = null;
					}
				}
			}
			curr = after;
		}
		head = new_head;
	}
	public int getMiddle() {
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null) {
//			fast.next!=null || fast!=null //A
//			fast.next!=null && fast!=null //B
//			
//			fast!=null || fast.next!=null //C
//			fast!=null && fast.next!=null //D
			
					
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}
	public int KthfromLast(int k) {
		Node C2 = head;
		for(int i=0;i<k;i++) {
			C2 = C2.next;
		}
		Node C1 = head;
		while(C2!=null) {
			C1 = C1.next;
			C2 = C2.next;
		}
		return C1.data;
	}
	
}
