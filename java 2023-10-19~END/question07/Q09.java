package question07;

import java.util.Random;
import java.util.Scanner;

public class Q09 {

	public static boolean exists(int a[], int to, int r) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == r) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		System.out.print("정수 몇개?");
		int a = scanner.nextInt();
		int b[] = new int[a];

		for (int i = 1; i < b.length; i++) {

			int c = r.nextInt(100) + 1;

			if (exists(b, i, c)) {
				i--;
				continue;
			}
			b[i] = c;
			System.out.print(b[i] + " ");

			if (i % 10 == 0) {
				System.out.println();

			}
		}

	}

}