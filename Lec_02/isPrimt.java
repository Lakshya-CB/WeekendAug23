package Lec_02;

public class isPrimt {
	public static void main(String[] args) {
		int num = 13;
		int div = 1;
		int noFac = 0;
		while (div <= num) {
			int rem = num % div;
			System.out.println(div + " : " + rem);
			if (rem == 0) {
				noFac = noFac + 1;
			}
			div++;
		}
		System.out.println(noFac);
		if(noFac==2) {
			System.out.println("is Prime");
		}else {
			System.out.println("is not prime");
		}
	}
}
