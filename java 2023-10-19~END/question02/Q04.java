package question02;

import java.util.Scanner;

public class Q04 {
	public static void main(String[] args) {
		System.out.print("점수를 입력하세요>>");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.print("학년 입력하세요>>");
		int b = scanner.nextInt();

		if (a >= 60) {
			if (b == 4 && a < 70) {
				System.out.print("불합격");
			} else if (b == 4 && a >= 70) {
				System.out.print("합격2");
			} else {
				System.out.print("합격");
			}

		} else if (a < 60) {
			System.out.print("불합격");
		} else {
			System.out.print("불합격");
		}
		scanner.close();
	}
}
