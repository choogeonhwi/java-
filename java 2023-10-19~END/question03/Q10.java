package question03;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("매수 수량 입력>>");
		int b = scanner.nextInt();

		boolean c = true;
		int z = 0;
		int x = 0;
		int v = 0;
		int n = 0;

		if (c == true) {
			if (b % 5 == 0) {
				z = 5 * b;
				v = 2 * b;
				n = z + (v / 10);
				System.out.println("100달러짜리:" + n);
			} else {
				z = 5 * b;
				System.out.println("100달러짜리:" + z);
			}
		}
		if (b % 5 != 0) {
			x = 2 * b;
			System.out.println("10달러짜리:" + x);
		}

	}
}
