package question06;

import java.util.Scanner;

public class Q03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("양수 10개를 입력하세요.");
		int a = 0;
		int s[] = new int[10];
		int z = 100;
		int x = 0;
		for (int i = 0; i < 10; i++) {
			a = scanner.nextInt();
			s[i] = a;
			if (z >= s[i]) // sum과 입력 숫자를 비교해주는 조건문
			{
				z = s[i]; // 조건문을 통해 더 작은 수인 배열안에 있는 값을 sum에 넣어줌
			}
			if (x <= s[i]) // sum과 입력 숫자를 비교해주는 조건문
			{
				x = s[i]; // 조건문을 통해 더 작은 수인 배열안에 있는 값을 sum에 넣어줌
			}

		}
		System.out.println("가장 작은 수는" + z + "이고, 가장 큰 수는" + x + "이고, 최소값+최대값은" + (x + z) + "입니다.");

	}
}
