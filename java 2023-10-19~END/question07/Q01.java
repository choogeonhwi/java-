package question07;

import java.util.Scanner;

public class Q01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int b = 0;
		int u[] = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
		System.out.print("금액을 입력하시오>>");
		int a = scanner.nextInt();

		for (int i = 0; i < u.length; i++) {
			b = a / u[i];
			if (b > 0) {

				a = a % u[i];
				System.out.println(u[i] + "원 짜리" + b + "개입니다");
			}
		}
	}
}
