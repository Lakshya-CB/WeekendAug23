package Lec_23;

public class client {
	public static void main(String[] args) {
		LinkedList LL = new LinkedList();
		LL.addLast(10);
		LL.addLast(20);
		LL.addLast(30);
		LL.addLast(40);
		LL.addLast(50);
			
		LL.print();
		
		LL.addAt(2, 25);
		LL.print();
		System.out.println(LL.removeAt(2));
		LL.print();
	}
}
