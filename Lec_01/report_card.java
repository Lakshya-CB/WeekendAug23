package Lec_01;

public class report_card {
	public static void main(String[] args) {
		int marks = 92; // 64,73
//		&& logical and
//		|| logical or		
		if (71 <= marks && marks <= 80) {
			System.out.println("C");
		} else if (91 <= marks && marks <= 100) {
			System.out.println("A");
		} else if (51 <= marks && marks <= 60) {
			System.out.println("E");
		} else if (61 <= marks && marks <= 70) {
			System.out.println("D");
		} else if (81 <= marks && marks <= 90) {
			System.out.println("B");
		} else {
			System.out.println("F");
		}

	}
}
