package question04;

import java.util.Scanner;

public class Q02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("입력하세요>>");
		int n = scanner.nextInt();

		if (n == 5) {
			for (int i = 5; i > 0; i--) {

				for (int j = 0; j < i; j++) {

					System.out.print("*");
					/*
					 * 5 4 3 2 1 4 3 2 1 0
					 */
				}

				System.out.println();
				// 줄바꿈, ln을 이용하여 공백 표시 후 이동
			}

		}
	}
}