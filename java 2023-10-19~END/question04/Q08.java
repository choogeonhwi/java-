package question04;

import java.util.Scanner;

public class Q08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("양수 7개를 입력하세요");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int e = scanner.nextInt();
		int f = scanner.nextInt();
		int g = scanner.nextInt();
		int z[] = { a, b, c, d, e, f, g };

		int sum = 100;

		for (int i = 0; i < 7; i++) {
			if (sum >= z[i]) // sum과 입력 숫자를 비교해주는 조건문
			{
				sum = z[i]; // 조건문을 통해 더 작은 수인 배열안에 있는 값을 sum에 넣어줌
			}
		}
		System.out.println("입력된 값 중 가장 작은 수는 " + sum + "입니다."); // 최대 큰 수인 값이 들은 sum를 출력해줌
		scanner.close(); // scanner을 사용을 마침

	}
}
