package question01;

import java.util.Scanner;

public class question03 {
	public static void main(String[] args) {
		System.out.println("2개의 정수 입력");
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println("합=" + (a + b));// 문자열로 인한 계산오류()필수

		System.out.println("곱=" + a * b);

		scanner.close();
	}

}
