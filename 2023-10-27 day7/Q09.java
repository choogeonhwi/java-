package question03;

import java.util.Scanner;

public class Q09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("입력하세요>>");
		int n = scanner.nextInt();
		boolean m = false;

		if (n % 3 == 0) {
			System.out.println("3의 배수");
			m = true;
		}
		if (n % 5 == 0) {
			System.out.println("5의 배수");
			m = true;
		}
		if (n % 8 == 0) {
			System.out.println("8의 배수");
			m = true;
		}
		if (m == false) {
			m = false;
			System.out.println("어느 배수도 아니다");
		}

	}
}
