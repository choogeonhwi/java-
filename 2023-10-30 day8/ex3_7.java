package chapter03;

public class ex3_7 {
	public static void main(String[] args) {
		int[] even = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18 };
		int[] prime = { 2, 3, 5, 7, 11, 13, 17, 19 };
		int evensum = sum(even);
		int primesum = sum(prime);
		System.out.println(evensum);
		System.out.println(primesum);

	}

	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

}
