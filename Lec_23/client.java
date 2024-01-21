package Lec_23;

public class client {
	public static void main(String[] args) {
		LinkedList LL = new LinkedList();
		LL.addLast(10);
		LL.addLast(20);
		LL.addLast(30);
		LL.addLast(40);
		LL.addLast(50);
		LL.addLast(60);
		LL.addLast(70);
		LL.addLast(80);
		LL.addLast(90);
		
		LL.print();
		LL.revK(3);
		LL.print();
		
//		LL.addAt(2, 25);
//		LL.print();
//		System.out.println(LL.removeAt(2));
//		LL.print();
//		LL.Rev();
//		LL.print();
	}
}
