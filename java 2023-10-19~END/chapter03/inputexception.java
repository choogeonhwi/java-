package chapter03;

import java.util.Scanner;

public class inputexception {
	public static void main(String[] args) {
		// 정수3개 입력받아 아닌 경우 예외처리

		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int a = 0;
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print(">>");

			try {

				a = scanner.nextInt();

			} catch (Exception e) {
				System.out.println("정수가 아닙니다.");
				scanner.next(); // 정수가 아닌경우 패스
				i--; // 다시 입력받기 위해서 카운트 감소
				continue;// 합계 누적 방지
			}
			sum += a;
		}
		System.out.println(sum);

	}
}
