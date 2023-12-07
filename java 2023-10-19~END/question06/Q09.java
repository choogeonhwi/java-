package question06;

import java.util.Random;
import java.util.Scanner;

public class Q09 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner scanner = new Scanner(System.in);
		int ntg = 0;
		int g = 0;

		for (int i = 0; i < 100; i++) {
			System.out.print("추측한 숫자를 입력하세요");
			g = scanner.nextInt();
			ntg = r.nextInt(10) + 1;
			System.out.println(ntg);
			if (g == ntg) {
				System.out.println("숫자가 맞습니다");
				break;
			}
			if (g != ntg) {
				if (g > ntg) {
					System.out.println("마 아니다");
					System.out.println("마 너무 크다");

				} else if (g < ntg) {
					System.out.println("마 아니다");
					System.out.println("마 너무 작다");
				}

			}
		}
		scanner.close();
	}
}
