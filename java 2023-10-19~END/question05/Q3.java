package question05;

public class Q3 {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		makearray(a);

	}

	public static int makearray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum = 100 + arr[i];
			System.out.print(sum + " ");
		}
		return sum;

	}

}
