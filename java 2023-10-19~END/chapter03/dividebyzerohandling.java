package chapter03;

import java.util.Scanner;

public class dividebyzerohandling {
	public static void main(String[] args) {
		// 나눗셈 몫을 출력
		Scanner scanner = new Scanner(System.in);
		int dividend;
		int divisor;

		while (true) {

			System.out.println("분자 입력");
			dividend = scanner.nextInt();
			System.out.println("분모 입력");
			divisor = scanner.nextInt();

			try {
				System.out.println(dividend + "를" + divisor + "로 나누면" + dividend / divisor + "입니다");
				break;
// 불능 발생 실행문			
			} catch (Exception e) {
				System.out.println("0으로 나눌 수 없습니다.다시입력하세요.");
			}
// 예외를 처리하여 정상적으로 출력		

		}

		// scanner.close();
		// while에서 무한반복하면 도달할 수 없어 오류발생 -> break 사용
		scanner.close();
	}
}
