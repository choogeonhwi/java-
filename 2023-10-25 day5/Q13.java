package question01;

import java.util.Scanner;

public class Q13 {
	public static void main(String[] args) {
		System.out.println("달을 입력하세요>>");
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();

		if (a >= 3 && a <= 5) {
			System.out.println("봄입니다.");
		} else if (a >= 6 && a <= 8) {
			System.out.println("여름입니다.");
		} else if (a >= 9 && a <= 11) {
			System.out.println("가을입니다.");
		} else if (a <= 12 || a <= 1 || a <= 2) {
			System.out.println("겨울입니다.");
		} else
			System.out.println("잘못된 입력입니다.");

		scanner.close();
	}
}
