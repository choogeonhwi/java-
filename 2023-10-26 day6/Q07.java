package question02;

import java.util.Scanner;

public class Q07 {
	public static void main(String[] args) {
		System.out.print("연산 입력>>");
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		String c = scanner.next();
		int b = scanner.nextInt();

		switch (c) {
		case "+":
			System.out.println(a + "+" + b + "의 계산 결과는" + (a + b));
			break;

		case "-":
			System.out.println(a + "-" + b + "의 계산 결과는" + (a - b));
			break;

		case "*":
			System.out.println(a + "*" + b + "의 계산 결과는" + (a * b));
			break;

		case "/":
			if (b == 0) {
				System.out.println("나눌 수 없다");
			} else {
				System.out.println(a + "/" + b + "의 계산 결과는" + (a / b));
			}
			break;
		}

	}
}
