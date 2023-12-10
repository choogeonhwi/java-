package question04;

import java.util.Scanner;

public class Q07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("금액을 입력하시오>>");
		int s = scanner.nextInt();
		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0;

		if (s > 50000) {
			a = s / 50000;
		}
		if (s > 10000) {
			b = s % 50000;
			b = b / 10000;
		}
		if (s > 1000) {
			c = s % 10000;
			c = c / 1000;
		}
		if (s > 100) {
			d = s % 1000;
			d = d / 100;
		}
		if (s > 50) {
			e = s % 100;
			e = e / 50;
		}
		if (s > 10) {
			f = s % 50;
			f = f / 10;
		}
		if (s > 1) {
			g = s % 10;
		}

		System.out.println("오만원권:" + a + "\n" + "만원권:" + b + "\n" + "천원권:" + c + "\n" + "백원:" + d + "\n" + "오십원:" + e
				+ "\n" + "십원:" + f + "\n" + "일원:" + g);
		scanner.close();
	}
}
