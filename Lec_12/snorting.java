package Lec_12;

public class snorting {
	public static void main(String[] args) {
		int[] arr = {50,40,30,20,10};
		print(arr);
//		selection(arr);
		Insertion_1(arr);
		print(arr);
//		bubble(arr);
//		print(arr);
	}

	public static void print(int[] arr) {
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
	}

	public static void bubble(int[] arr) {
		for (int cnt = 1; cnt < arr.length; cnt++) {
			for (int s = 0; s <= arr.length - 2; s++) {
//			L => s, R => s+1
				if (arr[s] > arr[s + 1]) {
					int temp = arr[s];
					arr[s] = arr[s + 1];
					arr[s + 1] = temp;
				}
			}
			print(arr);
		}
	}

	public static void selection(int[] arr) {

		for (int e = arr.length - 1; e >= 1; e--) {
			int max_ali_idx = 0;
			for (int i = 0; i <= e; i++) {
				if (arr[max_ali_idx] < arr[i]) {
					max_ali_idx = i;
				}
			}
//		swap!! 
			int temp = arr[e];
			arr[e] = arr[max_ali_idx];
			arr[max_ali_idx] = temp;

			System.out.println(e);
			print(arr);
			System.out.println("==============");
		}

	}

	public static void Insertion_2(int[] arr) {
//		10,20,30,40,50,25
		int e = arr.length - 2;

	}

	public static void Insertion_1(int[] arr) {
//	10,20,30,40,50,25
		for (int e = 0; e <= arr.length - 2; e++) {
			for (int s = e; s >= 0; s--) {
//			s, s+1!!
				if (arr[s] > arr[s + 1]) {
					int temp = arr[s];
					arr[s] = arr[s + 1];
					arr[s + 1] = temp;
				}
			}
		}

	}
}
