package question07;

import java.util.Scanner;

public class Q02 {
	public static void main(String[] args) {
		double p = 0, r = 0, b = 0, y = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("원금을 입력하세요");
		p = scan.nextDouble();
		System.out.print("연이율을 입력하세요");
		r = scan.nextDouble();
		System.out.println("연도수        원리금");

		b = p;

		for (int i = 0; i < 100; i++) {
			y = y + 1;
			b = b * (1.0 + r / 100.0);
			System.out.println((int) y + "   " + b);
			if (b >= p * 2) {
				System.out.println("필요한 연도수 = " + (int) y);
				break;
			}

		}

	}
}
