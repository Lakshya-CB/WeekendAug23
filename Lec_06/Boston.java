package Lec_06;

public class Boston {
	public static void main(String[] args) {
		int num = 1*11*13*17*23;
		System.out.println("=>"+num);
		int baackup = num;
		int sumOfDigi =0;
		while(num>0) {
			sumOfDigi = sumOfDigi + (num%10);
			num = num/10;
		}
//		System.out.println(sumOfDigi);
		num = baackup;
//		######################
		int div = 2;
		int sumOfFac = 0;
		while(num>1) {
			if(num%div==0) {
				System.out.println(div);
				num = num/div;
//				sumOfFac = sumOfFac+div;
				int div_copy = div;
				while(div_copy>0) {
					int dig = div_copy%10;
					sumOfFac = sumOfFac+dig;
					div_copy = div_copy/10;
				}
			}else {
				div++;
			}
		}
		System.out.println(sumOfDigi + " - "+sumOfFac);
		
	}
}
