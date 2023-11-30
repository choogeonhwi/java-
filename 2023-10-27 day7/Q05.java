package question03;

import java.util.Scanner;

public class Q05 {
	public static void main(String[] args) {
		System.out.print("정수 5개 입력하세요>>");
		Scanner scanner = new Scanner(System.in);
		int a = 0;

		int sum = 0;

		for (int i = 0; i < 5; i++) {

			a = scanner.nextInt();

			if (a > 0) {
				sum += a;
			}

		}
		System.out.println(sum);
	}
}
