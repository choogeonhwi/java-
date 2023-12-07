package question07;

import chapter03.returnarray;

class AU {
	public static int[] concat(int[] a, int[] b) {
		int c[] = new int[9];
		for (int i = 0; i < 4; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < 5; i++) {
			int in = 4 + i;
			c[in] = b[i];
		}
		return c;
	}

	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (i == 0) {
				System.out.print("[ ");
			}

			System.out.print(a[i] + " ");
			if (i == 8) {
				System.out.print("]");
			}

		}

	}
}

public class Q12 {
	public static void main(String[] args) {
		int[] array1 = { 1, 5, 7, 9 };
		int[] array2 = { 3, 6, -1, 100, 77 };
		int[] array3 = AU.concat(array1, array2);
		AU.print(array3);
	}
}