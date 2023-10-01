package Lec_08;

public class Arm_Strong {
	public static void main(String[] args) {
		int n = 1000;
		printAllArm(n);
	}

	public static void printAllArm(int n) {
		for (int num = 1; num <= n; num++) {
			if (isArm(num)) {
				System.out.println(num);
			}
		}
	}

	public static boolean isArm(int num) {
		int nod = numOfDigits(num);
		int sum = 0;
		int copy = num;
		while (num > 0) {
			int digit = num % 10;
			sum = sum + (int) Math.pow(digit, nod);
			num = num / 10;
		}
		if (copy == sum) {
			return true;
		} else {
			return false;
		}
	}

	public static int numOfDigits(int num) {
		int ans = 0;
		while (num > 0) {
			num = num / 10;
			ans++;
		}
//		System.out.println(ans);
		return ans;
	}
}
