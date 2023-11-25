package Lec_15;

public class rec_basics {
	public static void main(String[] args) {
//		PI(5);
		PDI(4);
	}
	public static void PD(int n) {
//		BP : PD(n)
//		SP : PD(n-1)
		
		if(n==1) { 
			// smallest problem!!!
//			Base case!!
			System.out.println(1);
			return;
		}
		System.out.println(n);
		PD(n-1);
	}
	public static void PI(int n) {
//		BP : PI(n)
//		SP : PI(n-1)
		if(n==0) {
			return;
		}
		PI(n-1);
		System.out.println(n);		
	}

	
	public static void PDI(int n) {
//		BP : PDI(n)
//		SP : PDI(n-1);
		if(n==0) {
			return;
		}
		System.out.println(n);
		PDI(n-1);
		System.out.println(n);
		
	}
	
}
