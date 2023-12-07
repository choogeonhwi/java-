package question04;

import java.util.Scanner;

public class Q01 {
	public static void main(String[] args) {
		System.out.print("가구수를 입력하세요>>");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		int z = 120 * 33;
		int x = 120 * 50;
		int c = 120 * 66;
		int v = 120 * 83;

		if (a == 1) {
			System.out.println("100달러짜리 " + z / 1200);
			System.out.print("10달러짜리 " + (z % 1200) / 100);
		}
		if (a == 2) {
			System.out.println("100달러짜리 " + x / 1200);

		}
		if (a == 3) {
			System.out.println("100달러짜리 " + c / 1200);
			System.out.println("10달러짜리 " + (c % 1200) / 110);
		}
		if (a >= 4) {
			System.out.println("100달러짜리 " + v / 1200);
			System.out.println("10달러짜리 " + (v % 1200) / 100);
		}

		scanner.close();

	}
}
